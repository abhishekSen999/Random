package binarytree;
import java.io.*;
public class BinaryTree
{
    Node_BT head;

    public BinaryTree() 
    {
        head=null;
    }








    //binary tree insertion
    public void insertBT(int arr[])
    {
        head=insert_innerBT(arr,0);
    }
    public Node_BT insert_innerBT(int arr[],int i)
    {
        //left=index*2+1
        //right=index*2+2;
        if(arr[i]==-1)return null;
        Node_BT node=new Node_BT(arr[i]);
        if (i*2+1<arr.length)
            node.left=insert_innerBT(arr,i*2+1);
        if (i*2+2<arr.length)
            node.right=insert_innerBT(arr, i*2+2);
        return node;

    }









    //binary search tree insertion
    public void insertBST(int arr[])//BST insertion
    {
        for(int i=0;i<arr.length;i++)insert_innerBST(head,arr[i]);
        
    }

    void  insert_innerBST(Node_BT node,int key)
    {       
        if(head==null){ head=new Node_BT(key);return;}
        if(key<=node.key){
            if (node.left==null)
            {
                node.left=new Node_BT(key);
            }
            else
                insert_innerBST(node.left,key);
        }
        else{
            if(node.right==null)
            {
                node.right=new Node_BT(key);
            }
            else 
                insert_innerBST(node.right,key);
        }
        
    }
    public void printTree()//inorder
    {
        print(head);
        System.out.println();

    }
    public void print(Node_BT node)
    {
        if (node == null)
            return;
        print(node.left);
        System.out.print("   "+node.key+"   ");
        print(node.right);
    }
    
}
