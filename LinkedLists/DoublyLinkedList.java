/**
   DoublyLinkedList.java                          Author: Kene Udeh.
*/
public class DoublyLinkedList {

	private static int size;
	private Node head;

	/**
      Inner Node class represents a node in the LinkedList.
	*/    
    private class Node{

    	private Object data;
    	private Node next;
    	private Node prev;

    	     /**
       Constructor for inner node class.
      */
      public Node(Object data){
         this.data = data;
         next = null;
      }
      
      /**
        getData(): gets the data of the node.
      */
      public Object getData(){
      	return this.data;
      }
      
      /**
        setData(Object data): sets the data of the node.
      */
      public void setData(Object data){
      	 this.data = data;
      }

      /**
        getNext(): gets the next node.
      */
      public Node getNext(){
      	return this.next;
      }
      
      /**
        setNext(Node data): sets the next node.
      */
      public void setNext(Node next){
      	 this.next = next;
      }

     /**
        getPrev(): gets the previous node.
      */
      public Node getPrev(){
            return this.prev;
      }

    /**
        setPrev(Node data): sets the previous node.
    */
       public void setPrev(Node prev){
    		this.prev = prev;
       }
    }
    
    /**
      DoublyLinkedList Constructor.
    */
    public DoublyLinkedList(){
       head = new Node(null);
       size = 0;
    }

    /**
      insertFirst(Object data): Adds an element at the beginning of the list.
    */
    public void insertFirst(Object data){

    	Node newNode;
    	Node nextNode;

        if(head != null){

        	newNode = new Node(data);

        	newNode.setPrev(null);
        	nextNode = head.getNext();
            newNode.setNext(nextNode);
            if(nextNode != null)
              nextNode.setPrev(newNode);
            head.setNext(newNode);
        }

    	incrementSize();
    }

    /**
      deleteFirst(): Deletes the first element in the list.
    */
    public void deleteFirst(){

    	Node node;
    	Node next;

        if(head != null){

          node = head.getNext();

          if(node != null){

          	  next = node.getNext();
              head.setNext(next);
              next.setPrev(head);

          }

        }

    	decrementSize();
    }

    /**
      insertLast(Object data): Adds an element at the end of the list.
    */
    public void insertLast(Object data){

    	Node newNode = new Node(data);
    	Node currNode;

        if(head != null){
           currNode = head;
           
           while(currNode.getNext() != null){
           	  currNode = currNode.getNext();
           }

           currNode.setNext(newNode);
           newNode.setPrev(currNode);
        	
        }

    	incrementSize();
    }

    /**
      deleteLast(): Deletes the last element in the list.
    */
    public void deleteLast(){

    	Node currNode=null;
    	Node prevNode=null;

        if(head != null){
           currNode = head;

           while(currNode.getNext() != null){

           	  currNode = currNode.getNext();
           }
            
        }
        
        prevNode = currNode.getPrev();
        prevNode.setNext(null);
        currNode.setPrev(null);

    	decrementSize();
    }

    /**
      insertAt(Object data, int index): inserts the element at a particular index in the linked list.
    */
    public void insertAt(Object data, int index){

    	Node currNode = head;
    	Node newNode = new Node(data);
    	Node prevNode;

    	if(index >= size || index < 0)
    		return;

    	for(int i = 0; i <= index; i++){
           currNode = currNode.getNext();
    	}

    	prevNode = currNode.getPrev();
    	if(prevNode != null)
    	  prevNode.setNext(newNode);
    	newNode.setPrev(prevNode);
    	newNode.setNext(currNode);
    	currNode.setPrev(newNode);

    	incrementSize();

    }

     /**
      delete(Object key):  Deletes an element from the list using the key.
    */
    public void delete(Object key){

    	Node currNode=null;
    	Node prevNode=null;
    	Node nextNode=null;

        if(head != null){
           currNode = head.getNext();

           while(currNode.getData() != key){

           	  currNode = currNode.getNext();

           }
            
        }
        
        prevNode = currNode.getPrev();
        nextNode = currNode.getNext();
        
        if(prevNode != null)
          prevNode.setNext(nextNode);

        if(nextNode != null)
          nextNode.setPrev(prevNode);

    	decrementSize();
    }   

    /**
      display(): displays the contents of the LinkedList.
    */
    public void display(){

    	if(head != null){
    		Node currNode = head.getNext();

    		while(currNode != null){
    			System.out.print(currNode.getData() + "<->");
    			currNode = currNode.getNext();
    		}
    		System.out.println("null");
    	}
    }

    /**
      getSize(): gets the current size of the linked list.
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
       DoublyLinkedList dl = new DoublyLinkedList();

       for(int i = 1; i <= 10; i++){
       	  dl.insertFirst(i);
       }

       dl.display();
       dl.deleteFirst();
       dl.display();
       dl.insertLast(11);
       dl.display();
       dl.deleteLast();
       dl.display();
       dl.delete(7);
       dl.display();
       dl.insertAt(12, 7);
       dl.display();
    }

}
