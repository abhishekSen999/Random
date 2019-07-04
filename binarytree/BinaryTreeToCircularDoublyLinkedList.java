package binarytree;

import java.io.IOException;

public class BinaryTreeToCircularDoublyLinkedList
{
    static Node_BT[] convert(Node_BT node) //returns {start,end} of list considering node as head of subtree.
    {
        Node_BT[] arr=new Node_BT[2];
        Node_BT[] arr_left=new Node_BT[2];
        Node_BT[] arr_right=new Node_BT[2];
        if(node.left==null)
        {
            arr[0]=node;
        }
        else
        {
            arr_left=convert(node.left);
            arr[0]=arr_left[0];
            node.left=arr_left[1];
            arr_left[1].right=node;
        }
        if(node.right==null)
        {
            arr[1]=node;
        }
        else
        {
            arr_right=convert(node.right);
            arr[1]=arr_right[1];
            node.right=arr_right[0];
            arr_right[1].left=node;
        }
        arr[0].left=arr[1];
        arr[1].right=arr[0];
        
        
        return arr;
    }
    public static void main(String args[])throws IOException
    {
        BinaryTree tree=CreateBinaryTree.createBT( new int[]{10,12,15,25,30,36,-1} );
        tree.printTree();

        Node_BT[] arr=convert(tree.head);
        Node_BT head=arr[0];
        printDoublyLinkedList(head);
    }
    static void printDoublyLinkedList(Node_BT head)
    {
        
        Node_BT node=head;
        do
        {
            System.out.print(" = "+node.key+" = ");
            node=node.right;
        }while(node!=head);
    }

}