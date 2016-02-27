package com.algorithm10;

public class algorithm01 {
	public static int CONS = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz();
	}
	public static void FizzBuzz(){
		System.out.println("from 1--"+CONS);
		for(int i = 0; i<CONS;i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("fizzbuzz");
				
			}else if(i % 5 == 0){
				System.out.println("bizz");
				
			}else if (i % 3 == 0) {
				System.out.println("fizz");
			}else  {
				System.out.println(i);
			}
				
			
			
		}
	}
}
