package com.example.Arrays;

import java.util.Random;

public class MinMaxInArray {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 1; i <= 10; i++) {
			arr[i - 1] = new Random().nextInt(100);
		}
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i+",");
		}
		System.out.print("]");
		int firstmax = 0;
		int secondMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				firstmax = arr[i] > arr[i + 1] ? arr[i] : arr[i + 1];

			} else {
				firstmax = firstmax > arr[i] ? firstmax : arr[i];
			}
			secondMax = firstmax > secondMax ? firstmax : secondMax;
		}
		System.out.println("\nThe maximum number is : " + secondMax);

	}

}
