package binarytree;
import java.io.*;
public class CreateBinaryTree
{
    public CreateBinaryTree() 
    {
        
    }
    public static void main(String args[])throws IOException
    {
        BinaryTree tree=new BinaryTree();
        int arr[]={7,3,5,2,4,6};
        tree.insertBT(arr);
        tree.printTree(); 
    }
    public static BinaryTree createBST(int arr[])
    {
        BinaryTree tree=new BinaryTree();
        tree.insertBST(arr);
        return tree;


    }
    public static BinaryTree createBT(int arr[])
    {
        //left=index*2+1
        //right=index*2+2;
        BinaryTree tree=new BinaryTree();
        tree.insertBT(arr);
        return tree;
    }
    
}