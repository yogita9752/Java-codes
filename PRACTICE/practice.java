package PRACTICE;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		//Scanner s=new Scanner (System.in);
		//String a="tonnymony";
		//String b=a.substring(0 ,5);
		//System.out.println(b);
		
		//if (a.compareTo(b)==0) {
			//System.out.println("true");
		//}
		//else {
		//	System.out.println("false");
		//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		
		//for (int i=0;i<a.length();i++) {
			//System.out.println(a.charAt(i));
		
		StringBuilder sb= new StringBuilder("hello");
		for(int i=0;i<sb.length()/2;i++) {
			int front=i;
			int back =sb.length()-1-i;
			char frontchar=sb.charAt(front);
			char backchar=sb.charAt(back);
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);
		}
		
		System.out.print(sb);
			
		}
		
}


