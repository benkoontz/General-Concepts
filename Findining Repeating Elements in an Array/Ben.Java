package halo;

import java.util.*;


// program to find duplicate numbers in an array


class Ben 
{ 
	// main
    public static void main(String args[]) 
    {
    	
    	int arr[] = {1, 2, 3, 4, 4, 3, -1, -1};
    	int array_size = arr.length;
    	
    	findMatches(arr, array_size);
    }
   

    
	public static void findMatches(int arr[], int size) {
		
		System.out.println("The matching elements are\n");
		
		for(int i = 0; i < size; i++) // gets each element in the array i
		{ 
			for (int j = i + 1; j < size; j++) // checks to see if an element after each i element is a duplicate
			{
				if(arr[i] == arr[j])
					System.out.println(arr[i] + " is a matching element ");
			}
		}
	}
}






    

