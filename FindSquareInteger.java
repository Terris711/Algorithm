package Algorithms;
import java.lang.Math;

public class FindSquareInteger {
	public static void main(String[] args) {
		System.out.println(findNumSquare(3, 9));
		System.out.println(findNumSquare(17, 24));
	}
	public static int findNumSquare(int a, int b) {
		int count = 0;
		for (int i = a; i <= b; i++) {
			int result = (int)Math.sqrt(i);
			if (result*result == i) {
				count += 1;
			}
			
		}
		return count;
	}
}

// Time Complexity: O(N)