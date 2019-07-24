/* A Naive recursive implementation of LCS problem in java*/
public class LongestSubstring 
{ 
//String lcs="";
static String mat[][];
/* Returns length of LCS for X[0..m-1], Y[0..n-1] */
String lcs( char[] X, char[] Y, int m, int n ,String cs) 
{ 
	if (m == 0 || n == 0) 
    return cs; 
    
	if (X[m-1] == Y[n-1]) 
    {
      	
	 	cs=X[m-1]+cs;
      	
     	return lcs(X, Y, m-1, n-1,cs);
    } 
	else{
      
     // if(lcs.length()<cs.length())
     // {
     //   lcs=cs;
        
     // }
        
     
      String s1=lcs(X, Y, m, n-1,"");
	  String s2=lcs(X, Y, m-1, n,"");
      if(cs.length()>=s1.length()&&cs.length()>=s2.length())return cs;
      else if(s1.length()>=cs.length()&&s1.length()>=s2.length())return s1;
      else return s2;

    }
}

/* Utility function to get max of 2 integers */
int max(int a, int b) 
{ 
	return (a > b)? a : b; 
} 

public static void main(String[] args) 
{ 
	LongestSubstring lcs = new LongestSubstring(); 
	String s1 = "AGGTAB"; 
	String s2 = "GXTABXX"; 
    mat=new String[s1.length()][s2.length()];
	char[] X=s1.toCharArray(); 
	char[] Y=s2.toCharArray(); 
	int m = X.length; 
	int n = Y.length; 
	

	System.out.println("Length of LCS is" + " " + lcs.lcs( X, Y, m, n ,"")); 
} 

} 