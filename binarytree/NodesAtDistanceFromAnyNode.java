package binarytree;
import java.util.*;
public class NodesAtDistanceFromAnyNode
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,4,5,6,7,16,17,8,9,-1,-1,-1,-1,-1,-1,-1,-1,12,13,14,15};
        BinaryTree tree=CreateBinaryTree.createBT(arr);
        Node_BT target=tree.head.left;
        NodesAtDistanceFromAnyNode ob=new NodesAtDistanceFromAnyNode();
       ob.printAllAtKDistance(tree.head, target, 3);
       //tree.printLevelOrderRelations();

    }


    void printNodes(Node_BT node, int distance)
    {
        if(node==null)return;
        if(distance==0)
        {
            System.out.print(" "+node.key);
        }
        printNodes(node.left, distance-1);
        printNodes(node.right, distance-1);
    }


    boolean getPath(Node_BT node, Node_BT target,ArrayList<Node_BT> path)
    {
        if(node == null)return false;
        if(node==target)
        {
            path.add(node);
            return true;
        }
        if(getPath(node.left, target, path)||getPath(node.right, target, path))
        {
            path.add(0,node);
            return true;
        }
        return false;
    }


    
    void printAllAtKDistance(Node_BT head , Node_BT target, int k)
    {
        printNodes(target,k);
        ArrayList<Node_BT> path=new ArrayList<Node_BT>();
        getPath(head, target, path);
        for(int i=path.size()-2,distance=1;i>=0;i--,distance++)
        {
            Node_BT node=path.get(i);
            if(distance==k)
            {
                System.out.print(" "+node.key);
                break;
            }
            if(node.right==path.get(i+1))
            {
                printNodes(node.left, k-distance-1);
            }
            else
            {
                printNodes(node.right, k-distance-1);
            }
        }

    }


}