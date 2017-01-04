/**
 InsertionSort.java                              Author: Kene Udeh.
 Insertion Sort implementation in the java programming language.
*/
public class InsertionSort {   
    
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
        insertionSort(numbers);

        //Print Array after sorting.
        System.out.println("---Array After Sorting---");
        for(int i = 0; i < numbers.length; i++){
        	System.out.print(numbers[i]+" ");
        }
        System.out.println();

	}
    
    /**
      insertionSort(double[] array): Insertion sort implementation.
    */
	public static void insertionSort(int[] array){
	   
     for(int i = 0; i < array.length; i++){
        int index = i;
        int element = array[i];

        while(index > 0 && array[index-1] > element){
           array[index] = array[index-1];
           index--;
        }

        array[index] = element;
     }
  }
}