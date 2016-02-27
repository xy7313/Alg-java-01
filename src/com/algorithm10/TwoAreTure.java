package com.algorithm10;
/*
 * 
 * x? y:z  x是一个boolean类型,若x为true,结果显示y,若x为false,则结果显示z.
 * (true ? x : 0); 这是一个三目运算符，
 * 意思就是如果表达式为true则结果为x否则为0 

	Complexity:
	Time: O(1) Space: O(1)
 */

public class TwoAreTure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IfTure(false, false, true));
	}

	public static boolean IfTure(boolean a, boolean b, boolean c){
		
		return a ? (b||c) : (b&&c);
		
	}

}
