package linkedlist;
import java.io.*;
public class CreateList{
    public static void main(String args[])throws IOException
    {
        LinkedList list= new LinkedList();
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(0);
        list.push(1);
        list.push(2);
        list.push(3);
        
        list.printList();
    }
    static LinkedList create(){
        LinkedList list= new LinkedList();
        list.push(12);
        list.push(3);
        list.push(10);
        list.push(5);
        list.push(8);
        list.push(2);
        list.push(4);
        list.push(1);
        list.push(7);
        list.push(6);
        list.push(11);
        return list;
    }
}
