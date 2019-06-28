package linkedlist;
import java.io.*;
public class LinkedList
{
    Node head;
    LinkedList()
    {
        head=null;
    }
    void push(int key)
    {
        Node temp=new Node(key);
        if (head==null)
        {
            head=temp;
            return;
        }
        Node iterator=head;
        while(iterator.next!=null)iterator=iterator.next;
        iterator.next=temp;
    }
    int insert(int key,int pos){
        int count=0;
        Node iterator=head;
        if (head==null&&pos==0)
        {
            if(pos==0){
                Node temp=new Node(key);
                head=temp;
                return 1;
            }
            else return 0;
        }
        

        while(iterator.next!=null && count<pos-1){
            iterator=iterator.next;
            count++;
        }
        // if (iterator.next==null)return 0;
        if(count!=pos-1) return 0;
       
        Node temp=new Node(key);
        temp.next= iterator.next;
        iterator.next=temp;
        return 1;
    }
    void printList()
    {
        Node iterator=head;
        while(iterator.next!=null){
            System.out.print("["+iterator.key+"] -> ");
            iterator=iterator.next;
        }
        System.out.println("["+iterator.key+"] ");
    }
}
