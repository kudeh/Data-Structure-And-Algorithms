/**
 MergeSort.java                              Author: Kene Udeh.
 Merge Sort implementation in the java programming language.
*/
public class MergeSort {   
    
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
        numbers = mergeSort(numbers);

        //Print Array after sorting.
        System.out.println("---Array After Sorting---");
        for(int i = 0; i < numbers.length; i++){
        	System.out.print(numbers[i]+" ");
        }
        System.out.println();

	}
    
    /**
      mergeSort(double[] array): Merge sort implementation, returns the resulting array.
    */
	public static int[] mergeSort(int[] array){

     int size = array.length;

	   if(size <= 1)
        return array;

     int[] a = new int[size/2];
     for(int i = 0; i < a.length; i++)
       a[i] = array[i];

     int[] b = new int[size-size/2];
     for(int i = 0; i < b.length; i++)
       b[i] = array[i+size/2];

     return merge(mergeSort(a), mergeSort(b));
      
  }

  /**
    merge(int[] a, int[] b): merges the two subarrays into one and returns it.
  */
  public static int[] merge(int[] a, int[] b){
      
      int[] c = new int[a.length+b.length];
      int i = 0, j = 0;

      for(int k = 0; k < c.length; k++){
         if(j >= b.length){
            c[k] = a[i];
            i++;
         }else if(i >= a.length){
            c[k] = b[j];
            j++;
         }else if(a[i] <= b[j]){
            c[k] = a[i];
            i++;
         }else if(b[j] <= a[i]){
            c[k] = b[j];
            j++;
         }

      }

      return c;
  }
}