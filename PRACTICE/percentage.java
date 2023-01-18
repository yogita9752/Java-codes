package PRACTICE;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in) ;
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int num4=s.nextInt();
		int num5=s.nextInt();
		int sum=(num1+num2+num3+num4+num5);
		int per=(sum*100)/500;
		System.out.println(per);
		
		
		

	}

}
