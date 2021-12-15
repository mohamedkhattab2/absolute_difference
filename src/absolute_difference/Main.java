package absolute_difference;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] minDiff = { 1, -3, 71, 68, 17 };
		int min = minAbsDiff(minDiff);
		System.out.println(min);

	}

	public static int minAbsDiff(int[] arr) {
		// sort array
		Arrays.sort(arr);
		// get diff to compare with it
		int diff = Math.abs(arr[0] - arr[1]);
		// loop over sorted array and compare with diff
		for (int i = arr.length - 1; i > 0; i--) {
			if (Math.abs(arr[i] - arr[i - 1]) < diff)
				diff = Math.abs(arr[i] - arr[i - 1]);
		}
		return diff;
	}

}
