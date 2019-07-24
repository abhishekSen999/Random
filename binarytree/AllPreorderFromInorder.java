package binarytree;
import java.io.*;
public class AllPreorderFromInorder
{
    public static void main(String args[])throws IOException{
        int[] inorder={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //String preorder="";
        int[] preorder=new int[inorder.length];
        Generate g=new Generate();
        long startTime = System.nanoTime();
        g.generate(inorder,0,inorder.length-1,preorder,0);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("mili seconds="+totalTime/1000000);

    }
}
class Generate
{
    public int generate(int[] inorder,int start,int end,int[] preorder,int index)
    {
        int nextIndex=index;
        if(index==inorder.length)
        {
            for(int i=0;i<preorder.length;i++)
                System.out.print(preorder[i]);

            System.out.println();
            return index;
        }
        for(int i=start;i<=end;i++)
        {
            //if(start<=i)
            preorder[index]=inorder[i];
            nextIndex=generate(inorder,start,i-1,preorder,index+1);
            //if(i<=end)
            if(nextIndex<inorder.length)
                nextIndex=generate(inorder,i+1,end,preorder,nextIndex);
        }
        return nextIndex;
        
    }
}