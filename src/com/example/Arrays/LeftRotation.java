package com.example.Arrays;

import java.util.Arrays;
import java.util.Random;

public class LeftRotation {

	static int[] rotLeft(int[] a, int d) {
		int start = 0;
		for (int j = 1; j <= d; j++) { // How many places you want to rotate
			for (int i = 0; i < a.length; i++) { // For traversing the Array
				if (i < d) { // storing only number of element wanted to shift.
					start = a[i];
				}
				while (i < a.length - 1) { // Shifting index to left.
					a[i] = a[i + 1];
					i++;
				}

				a[i] = start; // filling the last index with first.
			}
		}
		return a;

	}

	public static void main(String[] args) {

		int[] arr = new int[5];
		for (int i = 1; i <= 5; i++) {
			arr[i - 1] = new Random().nextInt(100);
		}
		System.out.println("Before Rotation");
		Arrays.stream(arr).forEach(System.out::println);

		int[] newArr = rotLeft(arr, 3);
		System.out.println("After Rotation");
		Arrays.stream(newArr).forEach(System.out::println);
	}

}
