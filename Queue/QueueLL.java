/**
   QueueLL.java                                         Author: Kene Udeh.
   Description: Implementation of a Queue Using a LinkedList.
*/
public class QueueLL{
    
    private Node head;
	private static int size;
	private Node end;
    
    /**
      Node inner class, represents a node in the Stack.
    */
	private class Node{

		private Object data;
		private Node next;
		private Node end;
        
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
       Constructor for QueueLL class.
    */
	public QueueLL(){
        size = 0;
        head = new Node(null);
        end = head;
	}

	/**
       enqueue(Object data): Inserts a node into the linked list.
	*/
    public void enqueue(Object data){
        
        Node nextNode = null;
        Node newNode = null;

    	if(head != null){

    	   newNode = new Node(data);
           end.setNext(newNode);
           end = newNode;
           incrementSize();
           
    	}

        
    }

    /**
       dequeue(): Removes a node from the linkedlist.
    */
    public Object dequeue(){
        
        Node currNode = head.getNext();
        Object data = null;
        Node nextNode = null;

    	if(currNode != null){
           
           data = currNode.getData();
           nextNode = currNode.getNext();
           head.setNext(nextNode);
           decrementSize();
    	}

    	if(isEmpty()){
    		end = head;
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
    	QueueLL qll = new QueueLL();

    	System.out.println(qll.isEmpty());

        for(int i = 1; i <= 10; i++){
       	  qll.enqueue(i);
        }

        //System.out.println(sll.peek());

        for(int i = 1; i <= 10; i++){
          Integer d = (Integer)qll.dequeue();
          System.out.println(d);
        }

        qll.dequeue();
        qll.enqueue(55);
        qll.enqueue(66);

        System.out.println(qll.dequeue());
        qll.enqueue(89);
        System.out.println(qll.dequeue()+"\n"+qll.dequeue());
	}
}