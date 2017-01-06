/**
 BinarySearch.java                              Author: Kene Udeh.
*/
public class BinarySearch {
	

	/**
       main(): Instantiates an array of Strings to be searched.
	*/
	public static void main(String[] args){
        
        int[] nums = {-34, 2, 3, 59, 65, 77, 90, 102, 105, 123, 193, 291, 401, 653, 902, 1291, 3472};

        int index = binarySearch(nums, 1291);
	}
    
    /**
       linearSearch(String[] array, String key): Performs a linear search for the given key in the array.
    */
	public static int binarySearch(int[] array, int key){
         
         boolean found = false;
         int index = -1;
         int upper = array.length;
         int lower = 0;
         int mid;

         while(!found){

            if(upper < lower){
                System.out.println(key+" not found in the array");
                break;
            }

            mid = lower + (upper-lower)/2;

            if(array[mid] < key){
                lower = mid+1;
            }

            if(array[mid] > key){
                upper = mid-1;
            }

            if(array[mid] == key){
                found = true;
                index = mid;
                System.out.println(key + " was found at index " + mid);
            }


         }

         return index;
	}

}