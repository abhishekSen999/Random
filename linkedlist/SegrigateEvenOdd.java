package linkedlist;
import java.io.IOException;

public class SegrigateEvenOdd{
    static LinkedList list;
    static void swap(Node parent_n1,Node n1,Node n2)
    {
        if (n1==list.head)list.head=n2;
        else
            parent_n1.next=n2;
        n1.next=n2.next;
        n2.next=n1;
    }
    static void bubbleSort()
    {
        Node node_i=list.head,node_j=list.head,node_j_p=list.head;
        for(node_i=list.head;node_i.next!=null;node_i=node_i.next)
        {
            
            for( node_j=list.head;node_j.next!=null;node_j_p=node_j,node_j=node_j.next)
            {
                if(node_j.key%2!=0&&node_j.next.key%2==0)swap(node_j_p,node_j,node_j.next);
            }
        }
    }


    public static void main(String args[])throws IOException
    {
        list=CreateList.create();
        list.printList();
        bubbleSort();
        
        // swap(list.head,list.head.next,list.head.next.next);
        list.printList();
    }    
}