/*@author Abhishek Sen
 *  isPrime function checks whether n is prime or not returns 1->prime   0->not prime
 *  complexity O(n^0.5)
 *  but n^0.5 is not calculated mathematically to  avoid overhead 
 */
import java.io.*;
import java.math.BigInteger; 
class Prime 
{
	static BigInteger count;
	static int isPrime(BigInteger n) 
	{
		if (n<=BigInteger.valueOf(1))return 0;
		else if (BigInteger.valueOf(2))return 1;
		BigInteger i=BigInteger.valueOf(2);
		BigInteger cn=n;
		for(i=BigInteger.valueOf(1);i<cn;i++)
		{
			count++;
			if(n%i==0)return 0;
			
			cn=n/i;
		}
		return 1;
	}
	
	public static void main(String args[]) throws IOException
	{
        StringBuilder s = new StringBuilder("");
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the number: ");
        Line = buf.readLine();
        while(Line != null) 
        {
            s.append(Line);
            Line = buf.readLine();
        }

		BigInteger n = new BigInteger(s.toString());
		count=0;
		int check=isPrime(n);
		System.out.println(n + "   isPrime> "+(check==1?"true":"false")+"   number of modulo checks: "+count);
		
	}
	
}