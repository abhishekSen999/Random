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
    static LinkedList create(int arr[]){
        LinkedList list= new LinkedList();
        for(int i=0;i<arr.length;i++)
        {
            list.push(arr[i]);
        }
        return list;
    }
}
