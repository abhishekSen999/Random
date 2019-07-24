import java.util.*;

public class DistanceLightTravels
{
    public static void main(String args[])
    {
        DistanceLightTravels ob=new DistanceLightTravels();
        int distance[]=ob.calculateLightDistance(new int[]{2,4,3,2,6,7,6});
        for(int i=0;i<distance.length;i++)
        {
            System.out.print(distance[i]+" ");
        }
    }



    int[] calculateLightDistance(int building[])
    {
        Stack<Integer> stack=new Stack<Integer>();
        int[] larger=new int[building.length];
        stack.push(building.length-1);
        if(building.length==1)return new int[]{1};
        int next=building.length-2;
        for(;next>=0;next--)
        {
            while(!stack.isEmpty() && building[next]>building[stack.peek()] )
            {
                int current=stack.pop();
                larger[current]=next;

            }
            stack.push(next);
        }
        while(!stack.isEmpty())
        {
            larger[stack.pop()]=-1;
        }
        for(int i=0;i<larger.length;i++)
        {
            larger[i]=i-larger[i];
        }
        return larger;
    }
}