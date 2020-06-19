import java.io.*;
public class AddBitManipulation
{
    public static void main(String args[])throws IOException
    {
        int a=-2;
        int b=-3;
        System.out.println("sum= "+add(a,b));
    }
    static long add(int a1,int b1)
    {
        long a=(long)a1,b =(long)b1;
        System.out.println(a+" "+b);
        long carry=a&b;
        long sum=a^b;
        while(carry!=0)
        {
            carry=carry<<1;
            long tempSum=sum^carry;
            carry=sum&carry;
            sum=tempSum;
        }
       return sum;
    }
}