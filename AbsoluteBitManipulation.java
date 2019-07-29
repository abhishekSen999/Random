public class AbsoluteBitManipulation
{
    public static void main(String args[])
    {
        int n=-6;
        System.out.println(abs2(n));
    }    
    public static int abs(int n)
    {
        int i=n>>>31;
        
        
        for(int k=0;k<32;k++)
        {
            n=n^(i<<k);
        }
        
        n=n+i;
        return n;
    }
    public static int abs2(int n)
    {
        int mask=n>>31;
        n=n^mask;
        n=n-mask;
        return n;
    }
}