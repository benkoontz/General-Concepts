package halo;

import java.util.*;


// program to remove duplicate numbers in an array


class Ben 
{ 
	// main
    public static void main(String args[]) 
    {
    	
    	int  original_array[] =  {1, 2, 3, 4, 4, 3, 3,3};
    	
    	System.out.println("original array\n" + Arrays.toString(original_array));
    	
    	int new_array[] = removeDuplicates(original_array);
   
        System.out.println("array with duplicates removed\n" + Arrays.toString(new_array));
    }
   

    
	public static int[] removeDuplicates(int arr[]) {
		
		if (arr.length == 0 || arr.length == 1)
			return arr;
		
		for(int i = 0; i < arr.length - 1; i ++) { // for every element in the array
			for(int j = i + 1; j < arr.length; j++) { // search for every element for i
				if(arr[i] == arr[j]) {
					arr[j] = 0; // make each duplicate 0
				}
			}
		}
		
		//arr[arr.length -1] = 0; // adds 0 for the last duplicate
		return arr;
	}
}






    

