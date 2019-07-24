import java.io.*;
// import java.util.*;
import java.util.regex.*;

public class PostFromInAndPre
{
    int headPre;
    public static void main(String args[]) throws IOException
    {
        int[] in={4, 2, 5, 1, 3, 6};
        int [] pre={1, 2, 4, 5, 3, 6};
        //Stack<Integer> postS= new Stack<Integer>();
        PostFromInAndPre ob=new PostFromInAndPre();

        String postS=ob.generatePostOrder(in, 0, in.length-1, pre);
        Pattern p=Pattern.compile("-?\\d+");
        Matcher m=p.matcher(postS);
        int post[]=new int[pre.length];
        int k=0;
        while(m.find()){
            post[k++]=Integer.parseInt(m.group());
        }
        for(int i=0;i<post.length;i++)System.out.print(" "+post[i]);


        //System.out.println(post);
        //while(postS.size()>0)System.out.print(" "+postS.pop());
    }
    int search(int[] ar,int start,int end,int key)
    {
        
       for(int i=start;i<=end;i++)if(ar[i]==key)return i;
        return -1;
    }
    String generatePostOrder(int[] in,int startIn ,int endIn,int[]pre)
    {
        //System.out.println("startIn="+startIn+"     endIn="+endIn);
        // if(startIn>endIn)return headPre;
        // if(startIn==endIn)
        // {
        //     post.push(pre[headPre]);
        //     return headPre+1;
        // }
        if(headPre>=pre.length)return "";
        int root=pre[headPre];
        int rootIndex=search(in,startIn,endIn,root);
       
        if(rootIndex==-1)
            return "";
        
        
        headPre++;
        
        return generatePostOrder(in, startIn, rootIndex-1, pre)+" "+generatePostOrder(in, rootIndex+1, endIn, pre)+" "+String.valueOf(root);
        //System.out.print(" "+root);
        //return headPre;    
    }
}