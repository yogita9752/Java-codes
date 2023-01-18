package PRACTICE;

import java.util.Scanner;



public class ArrayFindElement {

	public static void main(String[] args) {
		int [] arr1 = {1,2,4,5,2,7,8,9};
		int result=duplicate(arr1);
		System.out.println(result);
		

	}
	public static int duplicate(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					return arr[i];
				}
				
			}
			
			
				
		}
		return -1;
		
	}
	

}
