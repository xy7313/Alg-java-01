package com.algorithm10;

/*Given a string, write a function that returns a string that
	contains the same characters in the reverse order.
	Complexity:
	Time: O(n)
	Space:O(n)
 */

public class stringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("hello");
		System.out.println(str);

		String str1 = new String();
		str1 = reverse(str);
		System.out.println(str1);

	}
	
	
	public static String reverse(String input){
		StringBuilder builder = new StringBuilder();
		//The only slight trick is to use a string builder because Java string are immutable
		
		char[] cha = input.toCharArray();
		for(int i = cha.length - 1; i >= 0; i--){
			builder.append(cha[i]);
			
		}
		return builder.toString();
	
	}
}





	
