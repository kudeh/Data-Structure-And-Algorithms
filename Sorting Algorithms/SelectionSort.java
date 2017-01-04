/**
  SelectionSort.java                              Author: Kene Udeh.
  Selection Sort implementation in the java programming language.
*/
public class SelectionSort {   
    
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
        selectionSort(numbers);

        //Print Array after sorting.
        System.out.println("---Array After Sorting---");
        for(int i = 0; i < numbers.length; i++){
        	System.out.print(numbers[i]+" ");
        }
        System.out.println();

	}
    
    /**
      selectionSort(double[] array): Selection sort implementation.
    */
	public static void selectionSort(int[] array){
	   int temp = 0;

       for(int i = 0; i < array.length; i++){
          int min = i;
          for(int j = i+1; j < array.length; j++){
             if(array[j] < array[min])
                min = j;
          }
          if(array[min] < array[i]){
            //swap
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
          }
       }
    }
}