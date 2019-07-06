//finds 2 max and 2 min by 1 traversal of loop
import java.io.*;
public class MaxMin
{

    public static void main(String args[])throws IOException
    {
        int[] ar={-1,-3,-4,2,0,-5};
        int[] minmax=new int [4];// stores min1<min2<max2<max1
        minmax=findMinMax(ar);
        System.out.println(ar[minmax[0]]+" < "+ar[minmax[1]]+" < "+ar[minmax[2]]+" < "+ar[minmax[3]]);
    }
    static int[] findMinMax(int[] ar)
    {
        int min1=0,min2=0,max2=0,max1=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>ar[max1])
            {
                max2=max1;
                max1=i;
            }
            else if(ar[i]>ar[max2])
            {
                max2=i;
            }
            if(ar[i]<ar[min1])
            {
                min2=min1;
                min1=i;
            }
            else if(ar[i]<ar[min2])
            {
                min2=i;
            }
        }
        int [] minmax=new int[]{min1,min2,max2,max1};
        return minmax; 
    }
}