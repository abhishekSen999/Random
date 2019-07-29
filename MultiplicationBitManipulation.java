public class MultiplicationBitManipulation
{
    public static void main(String args[])
    {
        System.out.println(multiplyWith3Point5(2));
    }
    static int multiplyWith3Point5(int x)
    {
        // 3.5 * x= 2*x + x + x/2
        return ((x<<1) + x + (x>>1));
    }
}