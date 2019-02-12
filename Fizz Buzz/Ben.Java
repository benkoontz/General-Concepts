package halo;

import java.util.*;


// Fizz Buzz is sometimes a programming problem that is asked in job interviews
// if a number is divisible by 3 print fizz
// if a number is divisible by 5 print buzz
// if a number is divisible by 15 print fizz buzz

class Ben 
{ 
	// Driver method to test above 
    public static void main(String args[]) 
    {
    	
    	int n = 100;
    	
    	for(int i = 1; i <= n; i ++) {
    		
    		// you check 15 first because numbers divisible by 15, are already divisible by 3 and 5
    		if(i%15 == 0) {
    			System.out.println("fizz buzz" + " ");
    		}
    		
    		else if(i%5 == 0) {
    			System.out.println("buzz"  + " ");
    		}
    		
    		else if(i%3 == 0) {
    			System.out.println("fizz" + " ");
    		}
    		
    		else {
    			System.out.println(i + " ");
    		}
    		   		
    		
    	}
       
    } 
} 
