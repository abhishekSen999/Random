package binarytree;
import java.io.*;
public class GreaterSumTree{
    public static void main(String args[])throws IOException
    {

        BinaryTree tree=CreateBinaryTree.createBST(new int[]{11,2,29,1,7,15,40,35});

        tree.printTree();


        find(tree.head,0);
        tree.printTree();
    }
    static int find(Node_BT node,int topRightSum)
    {   
        if(node==null)return 0;
        int bottomRightSum=find(node.right,topRightSum);
        int tempKey=node.key;
        node.key=bottomRightSum + topRightSum;
        return tempKey+find(node.left, topRightSum + tempKey + bottomRightSum)  +   bottomRightSum;
        

    }
}
