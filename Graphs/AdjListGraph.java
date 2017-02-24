/**
  AdjListGraph.java                                                  Author: Kene Udeh
  Description: Adjacency List Graph(undirected) representation, showing common operations on a Graph.
*/

import java.util.LinkedList;

public class AdjListGraph{

    Node root;
    
    /**
       Node: represents a Node class.
    */
    public class Node{

    	private Object data;
    	private LinkedList<Node> adjacentNodes;
        
        //Node Constructor
    	public Node(Object data){
            this.data = data;
            adjacentNodes = null;
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
           addAdjacentNode(Object data): 
		*/        
		public void addAdjacentNode(Object data){
			Node n = new Node(data);
			adjacentNodes.add(n);
			n.adjacentNodes.add(this);
		}     
 
    }

    //Graph Constructor
	public AdjListGraph(Object data){
         root = new Node(data);
	}

	/**
       depthFirstSearch(Node root): Performs depth first search traversal on the graph.
	*/
    public void depthFirstSearch(Node root){

    }

	/**
       breadthFirstSearch(Node root): Performs depth first search traversal on the graph.
	*/
    public void breadthFirstSearch(Node root){

    }

    //main(): 
    public static void main(String[] args){

    }
}