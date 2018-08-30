package com.example.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int n = 100;
		long[] arr = new long[n];

		for (int i = 1; i <= n; i++) {
			if (i != 55)
				arr[i - 1] = i;
		}

		/*
		 * for (long k : arr) { System.out.println(k); }
		 */

		long arrsum = 0;
		long sum = n * (n + 1) / 2; //Sum of consecutive N natural numbers.

		for (int i = 0; i < arr.length; i++) {
			arrsum += arr[i];
		}

		System.out.println(sum - arrsum);

	}

}
