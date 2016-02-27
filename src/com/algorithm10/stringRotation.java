package com.algorithm10;
/*
 * Given two strings, write a function to check if one string is a rotation of the other
 We first check to make sure that the two strings are the same length. 
 We then concatenate the first string with itself, 
 and see if the second string is a substring of this concatenated string. 
 Take for example the inputs "tionssolu" and "solutions". 
 When we concatenate the first input with itself we get "tionssolutionssolu". 
 Now we can clearly see that this string contains "solutions".
Complexity:
Time: O(n2) Space: O(n)
 
 */
public class stringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public static boolean isRotation(String one, String two){
		return (one.length() == two.length()) && ((one + one).indexOf(two) != -1);
	} 
}

