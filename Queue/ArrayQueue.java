/**
  ArrayQueue.java                                        Author: Kene Udeh
  Description: Queue implemented using an Array.
*/
public class ArrayQueue{

	private Object[] queue;
	private int size;
	private int rear, front, numItems;
    
    /**
      Constructor for ArrayQueue class.
    */	
	public ArrayQueue(int size){
       this.size = size;
       queue = new Object[size];
       front = 0;
       rear = 0;
       numItems = 0;
	}

	/**
      enqueue(Object data): inserts an item into the queue.
	*/
	public void enqueue(Object data){
       
      if((numItems + 1) <= size){
      	queue[rear] = data;
        rear++;
        numItems++;
      }else{
      	System.out.println("queue is full");
      }       

	}

	/**
      dequeue(): deletes an item from the queue.
	*/
    public Object dequeue(){
       Object data = null;
       
       if(numItems > 0){
         data = queue[front];
         front++;
         numItems--;
       }else{
       	 System.out.println("queue is empty");
       }
       
       
       return data;
    }
    
    /**
      main(): testing purposes.
    */
	public static void main(String[] args){
      ArrayQueue queue = new ArrayQueue(10);

       for(int i = 1; i <= 10; i++){
       	  queue.enqueue((Integer)i);
       }
       
       for(int i = 1; i <= 10; i++){
         System.out.println(queue.dequeue());
       }

       //queue.enqueue(11);
	}
}