import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.regex.*;
import java.util.Arrays;




class Pair implements Comparable<Pair>{
        int num;
        int index;
        Pair(int n,int i )
        {
            num=n;
            index=i;
        }
        public int compareTo(Pair p)
        {
            return this.num-p.num;
        }
    }
public class MedianQuery {
    
    
    
    
    public static void main(String args[] ) throws Exception {
        File file=new File("/home/abhishek/GIT/Random/testMedianQuery.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        int q=Integer.parseInt(br.readLine());
        int queries[][]=new int[q][2];
        for(int i=0;i<q;i++)
        {
            String s=br.readLine();
            Pattern p=Pattern.compile("-?\\d+");
            Matcher m=p.matcher(s);
            m.find();
            queries[i][0]=Integer.parseInt(m.group())-1;
            m.find();
            queries[i][1]=Integer.parseInt(m.group())-1;
        }
        
            findMedians(arr,queries);
        

    }
    
    
    public static void findMedians(int[]arr,int[][]queries)
    {
        for(int q=0;q<queries.length;q++)
        {
            int start=queries[q][0];
            int end=queries[q][1];
            int len=end-start+1;
            int num[]=new int[len];
            for(int j=0;j<num.length;j++)
                num[j]=arr[start+j];
            int median=(len%2)==0?len/2-1:len/2;    
            int s=0,e=len-1;
            int pivot=partition(num,s,e);
            while(pivot!=median)
            {
                if(pivot<median)
                    s=pivot+1;
                else 
                    e=pivot-1;
                    
                pivot=partition(num,s,e);
                
            }
            System.out.println(num[median]);
        }
    }
    
    
    
    static int partition(int arr[],int start,int end)
    {
        int rnd=(int)(Math.random()*(double)(end-start))+start;
        int temp=arr[rnd];
        arr[rnd]=arr[end];
        arr[end]=temp;
        
        int pivot=end;
        int lesser=start-1;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<arr[pivot])
            {
                lesser++;
                temp=arr[lesser];
                arr[lesser]=arr[i];
                arr[i]=temp;
            }
        }
        lesser++;
        temp=arr[lesser];
        arr[lesser]=arr[pivot];
        arr[pivot]=temp;
        pivot=lesser;
        return pivot;
        
        
        
    }

}
