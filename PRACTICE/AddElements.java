package PRACTICE;

import java.util.Scanner;

public class AddElements {
	public static int[] inputArray(){
		Scanner s=new Scanner (System.in);
		int size=s.nextInt();
		int[] arr=new int [size];
		for (int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
		
	}
	public static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	    }
		
	}
	public static int sum(int[] arr) {
		
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			temp=temp+arr[i];
			
			
		}
		return temp;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=inputArray();
	    printArray(arr);
	    int sum=sum(arr);
	    System.out.println("sum is"+sum);
		

	}
	

}
