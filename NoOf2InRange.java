import java.io.IOException;

public class NoOf2InRange
{
    public static void main(String args[])throws IOException
    {
        String number="102";

        int[] n= new int[number.length()];// {2,   0,  1};
        int[] pow=new int[number.length()];//{1, 10, 100};
        for(int i=0;i<n.length;i++)
        {
            n[i]=number.charAt(n.length-i-1)-48;
            pow[i]=(int)Math.pow(10,i);
        }
        
        // for(int i=0;i<n.length;i++)
        //     System.out.print(n[i]);
        // System.out.println();
        // for(int i=0;i<n.length;i++)
        //     System.out.print(pow[i]);
        
        System.out.println("ans="+count(n,pow));
    }
    static int count(int[] n,int[] pow)
    {
        int count=0;
        int i=0;
        while(i<=n.length-1){
            if(n[i]>=2)
            {
                count+=pow[i];
            }
            if(i+1<=n.length-1)
            {
                count+=n[i+1]*pow[i]*(i+1);
            }
            i++;
        }
        return count;
    }
}