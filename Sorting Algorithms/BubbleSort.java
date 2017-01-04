/**
  BubbleSort.java                              Author: Kene Udeh.
  Bubble Sort implementation in the java programming language.
*/
public class BubbleSort {   
    
    /**
      main(): initializes an array of random numbers and sends it to be sorted.
    */
	public static void main(String[] args){
        
        int[] numbers = new int[10];  

        //Populate array with random numbers.
        System.out.println("---Array Before Sorting---");
        for(int i = 0; i < numbers.length; i++){
        	numbers[i] = (int)(Math.random()*1024+1);
        	System.out.print(numbers[i] + " ");
        }
        System.out.println();


        //sort
        bubbleSort(numbers);

        //Print Array after sorting.
        System.out.println("---Array After Sorting---");
        for(int i = 0; i < numbers.length; i++){
        	System.out.print(numbers[i]+" ");
        }
        System.out.println();

	}
    
    /**
      bubbleSort(double[] array): Bubble sort implementation.
    */
	public static void bubbleSort(int[] array){
	   int temp = 0;
      
       for(int i = 0; i < array.length-1; i++){
        
        boolean wasSwapped = false;

         for(int j = 0; j < array.length-1; j++){

         	if(array[j] > array[j+1]){
         		//swap the elements
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;

                wasSwapped = true;
         	}

         }

         //check if there were any swaps in this iteration, if not exit:done.
         if(!wasSwapped)
         	break;

	   }

    }
}