/**
 InterpolationSearch.java                              Author: Kene Udeh.
*/
public class InterpolationSearch {
	
	/**
       main(): Instantiates an array of integers to be searched.
	*/
	public static void main(String[] args){
        
        int[] nums = {-34, 2, 3, 59, 65, 77, 90, 102, 105, 123, 193, 291, 401, 653, 902, 1291, 3472};

        int index = interpolationSearch(nums, 102);
	}
    
    /**
       interpolationSearch(int[] array, int key): Performs a interpolation search for the given key in the array.
    */
	public static int interpolationSearch(int[] array, int key){
         
         boolean found = false;
         int index = -1;
         int upper = array.length-1;
         int lower = 0;
         int mid;

         while(!found){

            if(upper <= lower){
                break;
            }

            mid = lower + ((upper-lower)/(array[upper]-array[lower]))*(key-array[lower]);
            
            if(array[mid] == key){
                found = true;
                index = mid;
                System.out.println(key + " was found at index " + mid);
            }else 
              if(array[mid] < key){
                lower = mid+1;
              }else if(array[mid] > key){
                upper = mid-1;
              }       

         }

         if(!found){
            System.out.println(key + " was not found");
         }


         return index;
	}

}