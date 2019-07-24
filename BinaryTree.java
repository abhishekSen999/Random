class Node 
{ 
	int data; 
	Node left, right, next; 

	Node(int item) 
	{ 
		data = item; 
		left = right = next = null; 
	} 
} 

public class BinaryTree 
{ 
	Node root; 
	static Node next = null; 

	/* Set next of p and all descendents of p by traversing them in 
	reverse Inorder */
	void populateNext(Node node) 
	{ 
		if (node==null)return ;
      	Node current=node;
      while(current!=null)
      {
      	if(current.left==null)
        {
          current.next=current.right;
          current=current.right;
        }
        else
        {
          Node rightMost=current.left;
          while(rightMost.right!=null  && rightMost.right!=current)
            	rightMost=rightMost.right;
          
          if(rightMost.right==null)
          {
            rightMost.right=current;
            current=current.left;
          }
          else if(rightMost.right==current)
          {
            
            rightMost.right=null;
            
            current.next=current.right;
            current=current.right;
            
          }
          
        }
      }
       
	} 

	/* Driver program to test above functions*/
	public static void main(String args[]) 
	{ 
		/* Constructed binary tree is 
			10 
		/ \ 
		8	 12 
		/ 
		3 */
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(10); 
		tree.root.left = new Node(8); 
		tree.root.right = new Node(12); 
		tree.root.left.left = new Node(3); 

		// Populates nextRight pointer in all nodes 
		tree.populateNext(tree.root); 

		// Let us see the populated values 
		Node ptr = tree.root.left.left; 
		while (ptr != null) 
		{ 
			// -1 is printed if there is no successor 
			int print = ptr.next != null ? ptr.next.data : -1; 
			System.out.println("Next of " + ptr.data + " is: " + print); 
			ptr = ptr.next; 
		} 
	} 
} 
