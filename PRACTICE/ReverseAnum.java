package PRACTICE;

import java.util.Scanner;

public class ReverseAnum {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		int result =0;
		while(num>0) {
			//agr last se 00 hatana ho to
			//result=result*10+num%10;
			//num=num/10;
			result=num%10;
			System.out.print(result);
			num=num/10;
			
		
			
			}
			
			
		}
		

	
	}
	


