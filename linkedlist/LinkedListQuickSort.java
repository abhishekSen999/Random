package linkedlist;
import java.io.*;
public class LinkedListQuickSort
{
    static LinkedList list;
    
    static void partition(Node[] reference) //reference={start,pivot,end}
    {
        Node start=reference[0],end=reference[2];
        Node pivot=end;
        if(start==null ||end==null)return;
        Node node=start;
        Node node_parent=start;
        
        // if(node.key>pivot.key)
        // {
        //     Node temp=node.next;
        //     node.next=end.next;
        //     end.next=node;
        //     end=end.next;
        //     if(node==start)start=temp;
        //     node=temp;
            
        // }
        // else
        // {
        //     node=node.next;
        // }
        
        // Node node_parent=start;

        while(node!=pivot)
        {
            if(node.key>pivot.key)
            {
                Node temp=node.next;
                node.next=end.next;
                end.next=node;
                end=end.next;
                if(node==start)start=temp;
                if(node_parent!=node)node_parent.next=temp;
                else node_parent=temp;
                node=temp;
                
                

                
            }
            else
            {
                node_parent=node;
                node=node.next;
            }
        }
        reference[0]=start;reference[1]=pivot;reference[2]=end;
        
    }
    static void  quickSort(Node []reference)//reference={start,end}
    {

        Node start=reference[0],end=reference[1];

        if(start==null || end==null || start.key==end.key )return;
        Node[] reference_partition={start,null,end};

        partition(reference_partition);

        start=reference_partition[0];
        Node pivot=reference_partition[1];
        end=reference_partition[2];

        
        Node end1=start;
        while(end1!=pivot&& end1!=null&&end1.next!=pivot)end1=end1.next;

        Node[] reference1={start,end1};
        Node[] reference2={pivot.next,end};
        
        if(pivot!=start)
            quickSort(reference1);
        if (pivot!=end)
            quickSort(reference2);

        //reconnecting pointers
        reference1[1].next=pivot;
        pivot.next=reference2[0];

        reference[0]=reference1[0];
        reference[1]=reference2[1];
    }
    public static void main(String args[])throws IOException
    {
        list=CreateList.create();
        Node start=list.head;
        Node end=start;
        
        while(end.next!=null)end=end.next;
        list.printList();
        Node [] reference= {start,end};
        // partition(reference);
        // list.head=reference[0];
        // Node pivot=reference[1];
        // end=reference[2];
        // System.out.println("pivot= "+pivot.key);
        
        quickSort(reference);
        list.head=reference[0];
        
        list.printList();
        

    }
}