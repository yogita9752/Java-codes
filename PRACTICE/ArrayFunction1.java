package PRACTICE;

import java.util.Scanner;

public class ArrayFunction1 {
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
	
	
	public static void main (String[] args) {
		int[] arr=inputArray();
		printArray(arr);
		}
		
	

}
