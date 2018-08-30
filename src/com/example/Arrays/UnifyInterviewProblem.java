package com.example.Arrays;

import java.util.Arrays;

public class UnifyInterviewProblem {

	public static void main(String[] args) {

		System.out.println("Hello Java");

		int[] arr = new int[13];

		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 5;
		arr[3] = 0;
		arr[4] = 0;
		arr[5] = 5;
		arr[6] = 5;
		arr[7] = 4;
		arr[8] = 8;
		arr[9] = 6;
		arr[10] = 0;
		arr[11] = 6;
		arr[12] = 8;
		
		int temp = 0;
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == 0) {
				continue;
			} else {
				if (arr[i + 1] == 0) { // checking if next index is zero then only store the current element in temp.
					temp = arr[i];
					k = i; // remembering the index.
				}

				if (temp != 0 && k != i && temp == arr[i]) { // if the temp is updated means it contains some valid values. Also check if i is not compared to itself.
					arr[k] = temp * 2; /// Checking the conditions on behalf of temp.
					arr[i] = 0;
					temp = 0;
				} else {
					if (arr[i] == arr[i + 1]) {
						arr[i] = arr[i] * 2;
						arr[i + 1] = 0;
					}
				}

			}

		}
		
//Sorting all zeroes to right side of the Array.
		int zeroCounter = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 0)
				arr[zeroCounter++] = arr[i];

		while (zeroCounter < arr.length)
			arr[zeroCounter++] = 0;

		
		Arrays.stream(arr).forEach(System.out::println);

	}

}
