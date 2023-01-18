package PRACTICE;

import java.util.Scanner;

public class arraysearch {

	public static void main(String[] args) {
		System.out.println("enter the size");
		Scanner s=new Scanner (System.in);
		int size=s.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		
		}
		System.out.println();
			
		System.out.println("search element");
		int x=s.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("found x in index" + i);
			}
			
		}
		
		
		

	}

}
