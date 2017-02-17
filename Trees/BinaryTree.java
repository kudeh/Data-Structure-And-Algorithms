/**
  BinaryTree.java                                                  Author: Kene Udeh
  Description: Binary Tree representation, showing common operations on a Binary Tree.
*/
import java.util.*;

public class BinaryTree {

	public static Node root;
    
    /**
       Node: representation of a node in the tree.
    */
	private class Node{

        Object data;
        Node leftChild;
		Node rightChild;
        
        //Contructor for Node inner class.
		public Node(Object data){
            this.data = data;
            leftChild = null;
            rightChild = null;
		}
        
        /**
    	   setData(Object data): sets the data for a node.
        */
		public void setData(Object data){
			this.data = data;
		}
        
        /**
           getData(): gets the data for a node.
        */
		public Object getData(){
			return this.data;
		}

        /**
    	   setLeftChild(Node leftChild): sets the left Child of this node.
        */
		public void setLeftChild(Object data){
			this.leftChild = new Node(data);
		}
        
        /**
           getLeftChild(): gets the left Child of this node.
        */
		public Node getLeftChild(){
			return this.leftChild;
		}

		        /**
    	   setRightChild(Node rightChild): sets the right Child of this node.
        */
		public void setRightChild(Object data){
			this.rightChild = new Node(data);
		}
        
        /**
           getRightChild(): gets the right Child of this node.
        */
		public Node getRightChild(){
			return this.rightChild;
		}
	}
    
    //Constructor for Binary Tree.
	public BinaryTree(Object data){
        root = new Node(data);
	}
    
    /**
        preOrderTraversal(Node root): prints out the nodes using preorder trraversal.
    */
	public void preOrderTraversal(Node root){

		 if(root == null)
		 	return;
         
         System.out.print(root.getData() + " ");
        
         preOrderTraversal(root.getLeftChild());
        
         preOrderTraversal(root.getRightChild());
	}

	/**
        inOrderTraversal(Node root): prints out the nodes using inorder traversal.
    */
	public void inOrderTraversal(Node root){

		 if(root == null)
		 	return;

         inOrderTraversal(root.getLeftChild());

         System.out.print(root.getData() + " ");

         inOrderTraversal(root.getRightChild());
	}

	/**
        postOrderTraversal(Node root): prints out the nodes using preorder traversal.
    */
	public void postOrderTraversal(Node root){

		if(root == null)
			return;

        postOrderTraversal(root.getLeftChild());
        
        postOrderTraversal(root.getRightChild());
         
        System.out.print(root.getData() + " ");
	}

	/**
        bfs(Node root): prints out the nodes of the tree using preorder traversal.
	**/
	public void bfs(Node root){

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
        
        while(!q.isEmpty()){
        	Node n = q.remove();
        	System.out.print(n.getData() + " ");
            
            if(n.getLeftChild() != null)
        	  q.add(n.getLeftChild());

        	if(n.getRightChild() != null)
        	  q.add(n.getRightChild());
        }

        System.out.println();

	}

    
    //main(): 
	public static void main(String[] args){

        BinaryTree bt = new BinaryTree((Integer)0); //                          /  0  \
        root.setLeftChild((Integer)1);//                              / 1  \         /  2  \     
        root.setRightChild((Integer)2);  //                         3        4      5        6
        root.getLeftChild().setLeftChild((Integer)3);
        root.getLeftChild().setRightChild((Integer)4);
        root.getRightChild().setLeftChild((Integer)5);
        root.getRightChild().setRightChild((Integer)6);
        
        System.out.println("------PreOrder Traversal------");
        bt.preOrderTraversal(root);
        System.out.println();
        System.out.println("------InOrder Traversal------");
        bt.inOrderTraversal(root);
        System.out.println();
        System.out.println("------PostOrder Traversal------");
        bt.postOrderTraversal(root);
        System.out.println();
        System.out.println("------Breadth First Search------");
        bt.bfs(root);

	}
}