import java.io.*;
import java.util.LinkedList;
import java.util.HashMap;
public class HashedLinkedList{
    static HashMap<Integer,LinkedList<Integer> > hash_map;
    public static void main(String args[])throws IOException{
        hash_map=new HashMap<Integer,LinkedList<Integer> >();

        //hash_map.put(0,LinedList());
        put(1,100);
        put(2,200);
        put(3,300);
        put(3,3000);
        put(1,1000);
        System.out.println(hash_map);

    }

    static void put(int key, int value){
       
        if(hash_map.get(key)==null)
        {
            hash_map.put(key, new LinkedList<Integer>());
        }
        hash_map.get(key).add(value);
        
    }
}