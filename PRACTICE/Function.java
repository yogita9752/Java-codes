package PRACTICE;

import java.util.Scanner;

public class Function {
	public static void sumFunction(int a,int b) {
		int sum = a+b;
		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		sumFunction(a,b);
	   
		
	}

}
