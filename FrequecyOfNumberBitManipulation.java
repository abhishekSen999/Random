import java.io.*;
//in an array all nubers are present 3 times except 1 which is present ones, find that number
public class FrequecyOfNumberBitManipulation
{
    public static void main(String args[])throws IOException
    {
        int arr[]={12, 1, 12, 3, 12,6, 1, 1, 3, 3};
        System.out.println(findNumberWithFrequencyOne(arr));

    }
    static int findNumberWithFrequencyOne(int arr[])
    {
        int number=0;
        int sum=0;
        int i=1<<30;
        //System.out.println(Integer.toString(i,2));
        for(;i>0;i=i>>1)
        {
            sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if((arr[j]&i) !=0)sum++;
            }
            if(sum%3==0)
            {
                number=number<<1;
            }
            else
            {
                //System.out.println(i);
                number=(number<<1)|1;
            }
        }
        return number;
    }
}