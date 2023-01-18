package PRACTICE;

import java.util.Scanner;

public class StateMent {
	public static void main(String[] args) {
		System.out.println("enter a number");
		
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		
		
		if (num==5) {
			System.out.println("you are good person");
		}else {
			System.out.println("you are bad");
		}
		
		
}
}
