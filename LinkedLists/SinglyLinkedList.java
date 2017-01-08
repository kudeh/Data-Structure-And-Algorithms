/**

*/
public class SinglyLinkedList{

	private Node head;
	private static int size;
	
	/**
      Inner Node class represents a node in the LinkedList.
	*/
    private class Node{


      private Object data;
      private Node next;
      
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


    }
    
    /**
      Constructor for the SinglyLinkedList class.
    */
    public SinglyLinkedList(){
       head = new Node(null);
    }

    /**
      add(Object data): adds a new node to the end of the Linked list.
    */
    public void add(Object data){

    	if(head == null){
            head = new Node(data);

    	} 

    	Node currNode = head;
    	Node nextNode = new Node(data);

    	if(currNode != null) {

    	  while(currNode.getNext() != null){

            currNode = currNode.getNext();
    	  }

    	  currNode.setNext(nextNode);
    	}

        incrementSize();
    }

    /**
      get(int index): gets the node at a particular index in the linked list.
    */
    public Node get(int index){

    	Node currNode = head;

    	if(index >= size  || index < 0){
    		return null;
    	}

    	if(head.getNext() != null){

    	   currNode = head.getNext();

    	   for(int i = 0; i < index; i++){
    	   	  currNode = currNode.getNext();
    	   }
    	}

    	return currNode;
    }

    /**
      insert(Object data, int index): inserts a node at a particular point in the linkedlist.
    */
    public void insert(Object data, int index){
        
        if(index > size || index < 0){
        	return;
        }

        Node before = get(index-1);
        if(index == 0){
        	before = head;
        }

        Node after = get(index);
        Node node = new Node(data);
        
        before.setNext(node);
        node.setNext(after);

        incrementSize();
    }

    /**
      delete(int index): deletes the node at that particular index.
    */
    public void delete(int index){

    	if(index >= size || index < 0)
    		return;

        Node before = get(index-1);
        if(index == 0){
        	before = head;
        }

    	Node node = get(index);

    	before.setNext(node.getNext());

    	decrementSize();
    }

    /**
      find(Object data): Finds the first occurence of the data in the linkedlist.
    */
    public void find(Object key){

    	boolean found = false;
        
        if(head != null){ 

    	  Node currNode = head.getNext();
          
          while(currNode != null){

             if(currNode.getData() == key){
             	found = true;
                System.out.println("found: "+ key);
             }

             currNode = currNode.getNext();

          }

    	}

    	if(!found){
    		System.out.println("not found");
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
      display(): displays the array list.
    */
    public void display(){
      
      if(head != null){ 
        Node currNode = head.getNext();

        while(currNode != null){
          System.out.print(currNode.getData()+ "->");
      	  currNode = currNode.getNext();
        }

      }
      
      System.out.print("null\n");
    }

    /**
      reverse(): reverses the linked list
    */
    public void reverse(){

    	Node prev = null;
    	Node curr = head;                  //null<-1<-2<-3
    	Node next = curr.getNext();

    	while(next != null){
    		curr = next;
    		next = next.getNext();
            curr.setNext(prev);
            prev = curr;           
    	}

    	head.setNext(prev);
    }

    
    /**
      main(): 
    */
	public static void main(String[] args){
       
       SinglyLinkedList sl = new SinglyLinkedList();

       for(int i = 1; i <= 10; i++){
       	  sl.add(i);
       }

       
       
       sl.display();
       sl.reverse();
       sl.display();
       /*sl.insert(11, 10);
       sl.display();
       sl.insert(34, 7);
       sl.display();
       sl.delete(7);
       sl.display();
       sl.delete(0);
       sl.display();

       sl.find(7);
       sl.find(21);*/
       

	}
}