/**
   ArrayStack.java                                         Author: Kene Udeh.
   Description: Implementation of a Stack Using an Array.
*/
public class ArrayStack {

   private  int top;
   private int size;
   private Object[] stack;
   
   /**
     Constructor for ArrayStack class.
   */
   public ArrayStack(int size){
   	  this.top = -1;
      this.size = size;
      stack = new Object[size];
   }

   /**
     push(Object data): pushes an item into the stack.
   */
   public void push(Object data){
      
      if(top < 0)
      	 top++;

      if(top > size-1)
      	return;

      stack[top] = data;

      top++;
   }

   /**
     pop(): pops an item from the top of the stack.
   */
   public Object pop(){
     
     if(top < 0)
     	return null;

     if(top == size)
     	top--;
     
     Object result = stack[top];

     top--;

     return result;
      
   }
   
   /**
     main(): 
   */
   public static void main(String[] args){

       ArrayStack stack = new ArrayStack(10);

       for(int i = 0; i <= 10; i++){
       	  stack.push((Integer)i);
       }
       
       for(int i = 0; i <= 10; i++){
         System.out.println(stack.pop());
       }
   }

}