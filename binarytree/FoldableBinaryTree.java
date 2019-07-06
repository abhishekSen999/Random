package binarytree;
import java.io.*;
public class FoldableBinaryTree{
    public static void main(String args[])throws IOException
    {

        BinaryTree tree=CreateBinaryTree.createBT(new int[]{10,7,15,5,11,-1});
        System.out.println(isFoldable(tree.head.left,tree.head.right));
    }


    
    static boolean  isNotSame(Node_BT node1,Node_BT node2)
    {
        return !((node1==null&&node2==null)||(node1!=null&&node2!=null));
    }
    static boolean isFoldable(Node_BT node1,Node_BT node2)
    {
        if(node1==null &&node2 == null)
            return true;
        if(isNotSame(node1.left, node2.right)||isNotSame(node1.right, node2.left))
            return false;   
        return(isFoldable(node1.left,node2.right)&&isFoldable(node1.right, node2.left));
    }
}