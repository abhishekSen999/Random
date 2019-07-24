// Java implementation of an O(n) approach of level order 
// traversal in spiral form 

import java.util.*; 

// A Binary Tree node 
class Node { 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

public class SpiralBinaryTree { 

	static Node root; 

	void printSpiral(Node node) 
	{ 
      	int level=0;
		if(node==null)return;
      	Queue<Node> queue=new LinkedList<Node>();
      	Stack<Node> tempStack= new Stack<Node>();
      	queue.add(node);
      	while(queue.size()>0)
        {
          int length=queue.size();
          for(int i=0;i<length;i++)
          {
			node=queue.remove();
			if(level%2==1)
				System.out.print(node.data+" ");
			else 
				tempStack.push(node);
			if(node.left!=null)queue.add(node.left);
			if(node.right!=null)queue.add(node.right);
			
          }
          if(level%2==0){
            while(tempStack.size()>0)
            {
              System.out.print(tempStack.pop().data+" ");
            }
          }
          
		  level++;
        }
	} 

	public static void main(String[] args) 
	{ 
		SpiralBinaryTree tree = new SpiralBinaryTree(); 
		root = new Node(1); 
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.left.left = new Node(7); 
		root.left.right = new Node(6); 
		root.right.left = new Node(5); 
		root.right.right = new Node(4); 
		root.left.left.left=new Node(8);
		root.left.left.right=new Node(9);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(11);
		root.right.left.left=new Node(12);
		root.right.left.right=new Node(13);
		root.right.right.left=new Node(14);
		root.right.right.right=new Node(15);
		System.out.println("Spiral Order traversal of Binary Tree is "); 
		tree.printSpiral(root); 
	} 
} 
