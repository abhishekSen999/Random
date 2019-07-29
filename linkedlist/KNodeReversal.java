package linkedlist;



public class KNodeReversal {


    public static void main(String args)
    {
        LinkedList list=CreateList.create(new int[]{1,2,3,4,5});
        list.head=reverseKGroup(list.head,2);
        list.printList();
    }



    public static  Node reverseKGroup(Node head, int k) {
        
        Node prev=null,node=head,tailK=null,newHead=head;
        Node next=node.next;

        if(head==null) return null;
        while(next!=null)
        {
            Node tempNode=node;
            int i=0;
            for(i=1;i<k&&tempNode!=null;i++)
            {
                tempNode=tempNode.next;
            }
            if(i<k)break;
            if(newHead==head &&tempNode!=null)newHead=tempNode;
            if(tailK!=null)tailK.next=tempNode;
            tailK=node;
            for(i=1;i<k;i++)
            {
                next=node.next;
                node.next=prev;
                prev=node;
                node=next;
            }
        }
        head=newHead;
        return head;
        
        
    }
}