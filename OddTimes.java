package Algorithms;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Day8.countSort;

public class OddTimes {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		List<Integer> result = findOccurrence(arr);
		displayList(result);
	}

	public static List<Integer> findOccurrence(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> outputList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
				// if the element is already exist
				// ->> just add up by 1 for its appearance
			} else {
				map.put(arr[i], 1);
				// if it not appear yet, just mark it as 1 for visited
			}
		}

		for (Integer i : map.keySet()) {
			if(map.get(i) % 2 != 0) {
				outputList.add(i);
			}
		}
		return outputList;
	}
	
	public static void displayList(List<Integer> list) {
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}

// Time Complexity: O(N)