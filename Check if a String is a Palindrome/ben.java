package halo;

import java.util.*;


// program to test if a string is a palindrom
// a palindrome is a string that reads the same way forwards and backwards

class Ben 
{ 
	// main
    public static void main(String args[]) 
    {
        System.out.println("Is aaa a palindrom?: " + palindromTest("aaa"));
        System.out.println("Is aabaa a  palindrom?: " + palindromTest("aabaa"));
        System.out.println("Is bccb a palindrom?: " + palindromTest("bccb"));
        System.out.println("Is defg  a palindrom?: " + palindromTest("defg"));
        System.out.println("Is benny  a palindrom?: " + palindromTest("benny"));
    }

   // this method tests if a string is equal to a reversed string
   public static boolean palindromTest(String text) {
	   String reverse = reverse(text);
	   
	   if(text.equals(reverse))
		   return true;
	   else
		   return false;
   }
   
   // recursion method to reverse the string
   public static String reverse(String input) {
	   if(input == null || input.isEmpty()) { // check if the string is empty
		   return input;
	   }
	   
	   //  input.length() -1 accesses the last element
	   //  substring syntax: substring(begin index, end index)
	   // first , get the last character of a string:  input.charAt(input.length() - 1)
	   // reverse(input.substring(0, input.length() - 1)) this uses recursion to get each character one by one
	   return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
   }
}
    



    

