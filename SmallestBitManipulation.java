import java.util.*;
public class SmallestBitManipulation
{
    public static void main(String args[])
    {
        getSmallest(new int[]{5,12,9,1,15});
    }
    public static void getSmallest(int ar[])
    {
        Set<Integer> smallest=new HashSet<Integer>();
        Set<Integer> setAtI;
        for(int i=0;i<ar.length;i++)
        {
            smallest.add(ar[i]);
        }
        int i=1<<30;
        while(smallest.size()!=1)
        {
            setAtI=new HashSet<Integer>();
            Iterator<Integer> ite= smallest.iterator();
            while(ite.hasNext())
            {
                int n=ite.next();
                if((i&n)!=0)
                {
                    setAtI.add(n);
                }
            }
            if(setAtI.size()!=smallest.size())
            {
                smallest.removeAll(setAtI);
            }
            i=i>>>1;

        }
        System.out.println("smallest="+smallest);
    }
}