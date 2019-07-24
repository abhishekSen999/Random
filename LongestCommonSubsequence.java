/* Dynamic Programming Java implementation of LCS problem */
public class LongestCommonSubsequence 
{ 
  
  /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
  int lcs( char[] X, char[] Y, int m, int n ) 
  { 
    int L[][] = new int[m+1][n+1]; 
  
    /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
    for (int i=0; i<=m; i++) 
    { 
      for (int j=0; j<=n; j++) 
      { 
        if (i == 0 || j == 0) 
            L[i][j] = 0; 
        else if (X[i-1] == Y[j-1]) 
            L[i][j] = L[i-1][j-1] + 1; 
        else
            L[i][j] = max(L[i-1][j], L[i][j-1]); 
      } 
    } 
  return L[m][n]; 
  } 

  String lcS(char X[],char Y[],int m,int n)
  {
    String longest="";
      String L[][]=new String[m+1][n+1];
      for(int i=0;i<m+1;i++)
      {
          for (int j=0;j<n+1;j++)
          {
              if(i==0||j==0) L[i][j]="";
              else if(X[i-1]==Y[j-1])
              {
                  L[i][j]=L[i-1][j-1]+X[i-1];
                  if(longest.length()<L[i][j].length())
                  {
                      longest=L[i][j];
                  }
              }
              else
              {
                  
                  L[i][j]="";
              }
          }
      }
      return longest;
      
      
  }
  
  /* Utility function to get max of 2 integers */
  int max(int a, int b) 
  { 
    return (a > b)? a : b; 
  } 
  
  public static void main(String[] args) 
  { 
    LongestCommonSubsequence lcs = new LongestCommonSubsequence(); 
    String s1 = "AGGTABX"; 
    String s2 = "GXTABY"; 
  
    char[] X=s1.toCharArray(); 
    char[] Y=s2.toCharArray(); 
    int m = X.length; 
    int n = Y.length; 
  
    System.out.println("Length of LCS is" + " " + 
                                  lcs.lcS( X, Y, m, n ) ); 
  } 
  
} 
  