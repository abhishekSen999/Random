// Java program to check if the given string is 
// an interleaving of the other two strings 
public class InterleavingString{ 

	// Returns true if C is an interleaving 
	// of A and B, otherwise returns false 
	static boolean isInterleaved (String A, String B, String C)
      
	{ 
      int a=0,b=0,c=0;
      for(c=0;c<C.length();c++)
      {
        char t=C.charAt(c);
        if(b<B.length()&&t==B.charAt(b))b++;
        else if(a<A.length()&&t==A.charAt(a))a++;
		else return false;
      }
      if(b==B.length()&&a==A.length())return true;
	  return false;
	} 

	public static void main(String []args){ 
		
		String A = "AAB"; 
		String B = "AXY"; 
		String C = "AAXABY"; 
		if (isInterleaved(A, B, C) == true) 
			System.out.printf("%s is interleaved of %s and %s", C, A, B); 
		else
			System.out.printf("%s is not interleaved of %s and %s", C, A, B); 
	} 
} 
