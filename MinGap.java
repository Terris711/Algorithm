package Algorithms;

public class MinGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,3,4,1,7};
		System.out.println(findGap(arr));
	}

	
	public static int findGap(int[] arr) {
		int minGap =  arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && Math.abs(i - j) < minGap) {
					return Math.abs(i - j);
				}
			}
		}
		return -1;
	}
	
	

}
