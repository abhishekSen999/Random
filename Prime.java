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
		if (n.compareTo(BigInteger.ONE)<=0)return 0;
		else if (n.equals(BigInteger.TWO) )return 1;
		BigInteger i=BigInteger.valueOf(2);
		BigInteger cn=n;
		for(i=BigInteger.TWO;i.compareTo(cn)<0;i=i.add(BigInteger.ONE ))
		{
			count=count.add(BigInteger.ONE);
			if(n.mod(i).equals(BigInteger.ZERO))return 0;
			
			cn=n.divide(i);
			
		}
		return 1;
	}
	
	public static void main(String args[]) throws IOException
	{
        // StringBuilder s = new StringBuilder("");
		// BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        // // System.out.print("enter the number: ");
        // String Line = buf.readLine();
        // while(true) 
        // {
        //     s.append(Line);
		// 	Line = buf.readLine();
		// 	if(Line.equals("end")) break;
        // }
		// System.out.println("here: -"+s.toString().trim()+"-");
		// BigInteger n = new BigInteger(s.toString().trim());
		BigInteger n = new BigInteger("48112959837082048697 ");
		count=BigInteger.ZERO;
		int check=isPrime(n);
		System.out.println(n + "   isPrime> "+(check==1?"true":"false")+"   number of modulo checks: "+count);
		
	}
	
}