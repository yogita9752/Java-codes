package PRACTICE;

public class ArrayOFpairs {

	public static void main(String[] args) {
	 
		int [] arr = {1,3,4,8,10,5};
		pairs(arr);
		
				
	
	}
	static void pairs(int[] array) {
		for(int i=0;i<array.length;i++ ) {
			for(int j=i+1;j<array.length;j++) {
				System.out.print("("+array[i]+","+array[j]+")");
			}
		}
		
		
	}

}
