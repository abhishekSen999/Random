# Python3 program to find if there is a  
# pair in any root to leaf path with sum  
# equals to root's key  
  
# A binary tree node has data, pointer to 
# left child and a pointer to right child  
  
""" utility that allocates a new node with the  
given data and None left and right pointers. """
class newnode:  
    def __init__(self, data):  
        self.data = data  
        self.left = self.right = None
          
# Function to prroot to leaf path which  
# satisfies the condition  
def printPathUtil(node, s, root_data) : 
  
    # Base condition  
    if (node == None) : 
        return False
  
    # Check if current node makes a pair  
    # with any of the existing elements in set.  
    rem = root_data - node.data  
    if rem in s:  
        return True
  
    # Insert current node in set  
    s.add(node.data)  
  
    # If result returned by either left or  
    # right child is True, return True.  
    res = printPathUtil(node.left, s, root_data) or printPathUtil(node.right, s, root_data)  
  
    # Remove current node from hash table  
    s.remove(node.data)  
  
    return res  
  
# A wrapper over printPathUtil()  
def isPathSum(root) : 
      
    # create an empty hash table  
    s = set() 
      
    # Recursively check in left and right subtrees.  
    return printPathUtil(root.left, s, root.data) or printPathUtil(root.right, s, root.data)  
  
# Driver Code 
if __name__ == '__main__': 
    root = newnode(8)  
    root.left = newnode(5)  
    root.right = newnode(4)  
    root.left.left = newnode(9)  
    root.left.right = newnode(7)  
    root.left.right.left = newnode(1)  
    root.left.right.right = newnode(12)  
    root.left.right.right.right = newnode(2)  
    root.right.right = newnode(11)  
    root.right.right.left = newnode(3)  
    print("Yes") if (isPathSum(root)) else print("No") 