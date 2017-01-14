/**
   StackLL.java                                         Author: Kene Udeh.
   Description: Implementation of a Stack Using a LinkedList.
*/
public class StackLL {

	private Node head;
	private static int size;
    
    /**
      Node inner class, represents a node in the Stack.
    */
	private class Node{

		private Object data;
		private Node next;
        
        /**
           Constructor for node class, sets the data attribute.
        */
		public Node(Object data){
			this.data = data;
		}

		/**
           getNext(): returns the next Node.
		*/
        public Node getNext(){
        	return next;
        }

        /**
           setNext(Node next): sets the next Node.
        */
        public void setNext(Node next){
        	this.next = next;
        }

		/**
           getData(): returns the data of the Node.
		*/
        public Object getData(){
        	return this.data;
        }

        /**
           setData(Object data): sets the data of the Node.
        */
        public void setData(Object data){
        	this.data = data;
        }

	}
    
    /**
       Constructor for StackLL class.
    */
	public StackLL(){
		head = new Node(null);
		size = 0;
	}

	/**
       push(Object data): pushes an item into the Stack.
	*/
    public void push(Object data){
       
       Node nextNode;
       Node newNode;

       if(head != null){

       	  nextNode = head.getNext();
       	  newNode = new Node(data);

       	  head.setNext(newNode);
       	  newNode.setNext(nextNode);

       }
       
       incrementSize();

    }

    /**
       pop(): removes and returns the last item put into the stack.
    */
    public Object pop(){

        Node currNode;
        Node nextNode;
        Object data = 0;

        if(isEmpty()){
           return null;
        }

        if(head != null){
            currNode = head.getNext();

            if(currNode != null){
            	nextNode = currNode.getNext();
                data = currNode.getData();

                head.setNext(nextNode);
                currNode.setNext(null);
            }
        }

        decrementSize();

        return data;
    } 

    /**
       peek(): get the last item put into the stack without removing it.
    */
    public Object peek(){
    	Node currNode;
        Node nextNode;
        Object data = 0;

        if(isEmpty()){
        	return null;
        }

        if(head != null){
            currNode = head.getNext();

            if(currNode != null){
            	nextNode = currNode.getNext();
                data = currNode.getData();
            }
        }

        return data;
    }

    /**
       isEmpty(): checks it the stack is empty or not.
    */
    public boolean isEmpty(){

    	if(getSize() == 0)
    		return true;
    	else
    		return false;

    }

    /**
      getSize(): gets the current size of the Stack.
    */
    public static int getSize(){
    	return size;
    }

    /**
      incrementSize(): increments the size variable.
    */
    public static void incrementSize(){
    	size++;
    }

    /**
      decrementSize(): decrements the size variable.
    */
    public static void decrementSize(){
    	size--;
    }

	/**
       main(): 
	*/
    public static void main(String[] args){

    	StackLL sll = new StackLL();

    	System.out.println(sll.isEmpty());

        for(int i = 1; i <= 10; i++){
       	  sll.push(i);
        }

        System.out.println(sll.peek());

        for(int i = 1; i <= 10; i++){
          Integer d = (Integer)sll.pop();
          System.out.println(d);
        }


    }
}