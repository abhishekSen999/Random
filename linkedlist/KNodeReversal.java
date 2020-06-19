package linkedlist;
//import linkedlist.LinkedList;
//import linkedlist.CreateList;
public class KNodeReversal {

    public static void main(String args[]) {
        int[] arr=new int[] {};
        LinkedList list= new LinkedList();
        for(int i=0;i<arr.length;i++)
        {
            list.push(arr[i]);
        }


        list.head = reverseKGroup(list.head, 1);
        list.printList();
    }


    static Node[] reverseList(Node head,Node tail)
    {
        if(head==tail)return new Node[]{head,tail};
        Node prev=null;
        Node node=head;
        Node next=node.next;
        while( node!=tail )
        {
            next=node.next;
            node.next=prev;
            prev=node;
            node=next;
        }
        node.next=prev;
        Node newChunk[]=new Node[]{tail,head};
        return newChunk;
    }
    

    public static Node reverseKGroup(Node head, int k) {

        if(head==null)return null;
        Node[] prevChunk=new Node[]{null,null};
        Node newChunk[]=new Node[2];
        Node chunkHead=head;
        while(chunkHead!=null)
        {
            int count=0;
            Node chunkTail=null;
            for(chunkTail=chunkHead,count=1;chunkTail.next!=null&& count<k;count++,chunkTail=chunkTail.next);
            if(count<k)
            {
                if(prevChunk[1]!=null)
                {
                    prevChunk[1].next =chunkHead;   
                }
                else
                    head=chunkHead;
                
                break;
            }
            Node temp=chunkTail.next;
            newChunk=reverseList(chunkHead,chunkTail);
            chunkHead=temp;
            if(prevChunk[1]!=null)
            {
                prevChunk[1].next=newChunk[0];

            }
            else
            {
                head=newChunk[0];
            }
            prevChunk=newChunk;
        }

        return head;
    }
}