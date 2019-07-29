public class ADD_XOR
{
    public static void main(String args[])
    {
        ADD_XOR ob=new ADD_XOR();
        int i=1;
        for( i=1;i<1000;i++)
        {
            //System.out.println();
            if(ob.getCountForEquals(i)!=ob.getCountForEqualsBruteForce(i))
            {
                System.out.println("fails at "+i);
                break;
           
            }
        }
        if(i==1000)System.out.println("proved");
        //ob.getCountForEquals(9);
        // for(int i=0;i<9;i++)
        // {
            
        //     System.out.println(Integer.toString((i+9),2)+" "+Integer.toString((i^9),2));
        // }
    }


    int getCountForEqualsBruteForce(int n)
    {
        

        
        int count=0;
        for(int i=0;i<n;i++)
        {
            if((i+n) == (i^n))
                count++;
        }
        //System.out.println("             brute force "+count);
        return count;
    }


    int getCountForEquals(int n)
    {
        

        int numberOfZeros=0;

        for(int i=1;i<=n;i=i<<1)
        {
            if((i&n)==0)
                numberOfZeros++;
        }

        
        //System.out.println("number of zeros"+numberOfZerosAfterFirstSetBit);

        return (int)Math.pow(2,numberOfZeros);
    }
}
