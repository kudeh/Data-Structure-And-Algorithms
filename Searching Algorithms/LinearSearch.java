/**
 LinearSearch.java                              Author: Kene Udeh.
*/
public class LinearSearch {
	

	/**
       main(): Instantiates an array of Strings to be searched.
	*/
	public static void main(String[] args){
        
        String[] names = {"John", "Mary", "James", "Nancy", "Kene", "Stephanie", "Joe", "Cynthia", "Jennifer", "Xavier"};

        int index = linearSearch(names, "Kene");
        if(index != -1)
        	System.out.println("Found At Index " + index);
	}
    
    /**
       linearSearch(String[] array, String key): Performs a linear search for the given key in the array.
    */
	public static int linearSearch(String[] array, String key){
         
         boolean found = false;
         int index = -1;

         for(int i = 0; i < array.length; i++){
         	if(array[i].equals(key)){
                found = true;
                index = i;
                break;
         	}
         }

         if(!found)
         	System.out.println(key + " is not in the array");

         return index;
	}

}