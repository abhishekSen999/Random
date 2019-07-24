import java.util.*; 

public class HashMap_Demo { 
	public static void main(String[] args) 
	{ 

		// Creating an empty Hashtable 
		HashMap<Integer, String> hash_table = 
						new HashMap<Integer, String>(); 

		// Inserting the values into table 
		hash_table.put(10, "Geeks"); 
		hash_table.put(15, "4"); 
		hash_table.put(20, "Geeks"); 
		hash_table.put(20, "Welcomes"); 
		
		//for(int i=0;i<5;i++)hash_table.put(i,String.valueOf(i));
		// Displaying the Hashtable 
		System.out.println("Initial Table is: " + hash_table); 

		// // Getting the value of 25 
		 System.out.println("The Value is: " + hash_table.remove(25)); 

		 System.out.println("final Table is: " + hash_table); 

		// // Getting the value of 10 
		// System.out.println("The Value is: " + hash_table.get(10)); 
	} 
} 