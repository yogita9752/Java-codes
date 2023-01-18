package PRACTICE;

import java.util.Scanner;

public class function2 {
	   static boolean isPalindrome(int n) {
		int sum=0,temp=n,m;
		while(n>0) {
			m=n%10;
			sum=(sum*10)+m;
			n=n/10;
		}
		return temp==sum;
	}
	
	
	public static void main (String[]args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		if(isPalindrome(n)) {
			return true;
		}
		else {
			System.out.println("not");
		}
		
		
	}

}
