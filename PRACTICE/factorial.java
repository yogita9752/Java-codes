package PRACTICE;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		
		Scanner s= new Scanner (System.in);
		int num=s.nextInt();
		int result=1;
		for(int i=1;i<=num;i++) {
			result=result*i;
		}
		System.out.println(result);
		
		
	}

}
