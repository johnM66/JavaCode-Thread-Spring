package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

/* Class to print the inorder traversal */
class BinaryTree {
	static Node root;

	void inorder() {
		if (root == null) {
			return;

		}
		Stack<Node> stack=new Stack<Node>();
         Node curr=root;
         while(curr!=null || stack.size()>0) {
        	 
        	 while(curr!=null) {
        		 stack.push(curr);
        		 curr=curr.left;
        	 }
        	 curr=stack.pop();
        	 System.out.print(curr.data+" ");
        	 curr=curr.right;
         }
		
	}
	
	
	
	void levelOrder() {
	    if(root==null) {
	    	return;
	    }
	    Queue<Node> queue=new LinkedList<Node>();
	    queue.add(root);
	    while(!queue.isEmpty()) {
	    	Node temp=queue.poll();
	    	System.out.print(temp.data+" ");
	    	if(temp.left!=null) {
	    		queue.add(temp.left);
	    	}
	    	if(temp.right!=null) {
	    		queue.add(temp.right);
	    	}
	    }
	    
	    
	}
	void reverselevelOrder() {
	    if(root==null) {
	    	return;
	    }
	    Stack<Node> stack=new Stack<Node>();
	    stack.push(root);
	    while(!stack.isEmpty()) {
	    	
	    //	System.out.print(root.data+" ");
	    	if(root.left!=null) {
	    		stack.add(root.left);
	    	}
	    	if(root.right!=null) {
	    		stack.add(root.right);
	    	}
	    	
	    }
	    
	    
	}
	
	void inOrderwithoutRecurtion() {
		  if(root==null) {
		    	return;
		    }
		  Node current=root;
		  Stack<Node> stack=new Stack<Node>();
		
		  while(current!=null || stack.size()>0 ) {
		  while(current!=null) {
			 
			 
				  stack.push(current);
				  current=current.left;
			  
		  }
		  current =stack.pop();
		  System.out.print(current.data+" ");
		  current=current.right;
	   }
	}
	
	int traverse(Node root,int tilt) {
		if(root==null) {
			return 0;
		}
		tilt=0;
		int left =traverse(root.left,tilt);
		int right=traverse(root.right, tilt);
		tilt+=Math.abs(left-right);
		 return left + right + root.data; 
		
	}
	
	
	

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.inorder();
		//tree.levelOrder();
		//tree.inOrderwithoutRecurtion();
		
		int i=tree.traverse(root, 0);
		System.out.println(i);
	}
}