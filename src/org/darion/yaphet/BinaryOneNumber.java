package org.darion.yaphet;

import java.util.Scanner;

public class BinaryOneNumber {
	public static void main(String[] args) {
		int count = 0;
		int num = 0;

		System.out.print("Input a number : ");
		try (Scanner scanner = new Scanner(System.in)) {
			num = scanner.nextInt();
		}
		String outputInfo = num + " binary format have ONE : ";

		while (num != 0) {
			num = num & (num - 1);
			count++;
		}
		System.out.println(outputInfo + count);
	}
}
