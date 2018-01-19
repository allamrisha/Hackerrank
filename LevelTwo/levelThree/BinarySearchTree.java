package test;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Algorithm:
 * 1.Insert Operation:
 * Given a binary search tree and a number, 
 * inserts a new node with the given number in 
 * the correct place in the tree. Returns the new 
 * root pointer which the caller should then use 
 * (the standard trick to avoid using reference 
 * parameters)
 * 
 * 2.Minimum Value in BST
 * Given a non-empty binary search tree,  
 * return the minimum data value found in that 
 * tree. Note that the entire tree does not need 
 * to be searched.
 * 
 * 3.Height of BST using Level order traversal
 * Create a queue and push the root into the queue.
 * In a loop: initialize number of nodes in current level the size of queue
 * 		If the no. of nodes at this level is zero then return height => leaf node is reached
 *   		else increment the height
 *   	Remove the nodes of this level and add the nodes of next level to the queue
 *   	Decrement the node count to come out of the loop of second set of operations
 */

public class BinarySearchTree {
	//static TreeNode head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree tree = new BinarySearchTree();
        TreeNode root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);
 
        System.out.println("The minimum value of BST is " + tree.minvalue(root));
        System.out.println("Height of tree is " + tree.treeHeight(root));

	}
	    
	TreeNode insert(TreeNode node, int data) {
         
        /* 1. If the tree is empty, return a new,     
         single node */
        if (node == null) {
            return (new TreeNode(data));
        } else {
             
            /* 2. Otherwise, recursively insert values into the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    }
 
    int minvalue(TreeNode node) {
    	TreeNode current = node;
 
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }
    
    
    // Iterative method to find height of Binary Tree
    int treeHeight(TreeNode node) 
    {
        // Base Case
        if (node == null)
            return 0;
        // Create an empty queue for level order traversal
        Queue<TreeNode> q = new LinkedList();
  
        // Enqueue Root and initialize height
        q.add(node);
        int height = 0;
  
        while (true) 
        {
            // nodeCount (queue size) indicates number of nodes
            // at current level.
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;
  
            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while (nodeCount > 0) 
            {
            	TreeNode newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }
        }

    }
}
