package org.darion.algorithms.sort;

import java.util.Random;

public abstract class BaseSort {
	protected int[] array;

	public BaseSort(int size, int limit) {
		array = new int[size];
		Random random = new Random(System.currentTimeMillis());

		for (int index = 0; index < size; index++) {
			array[index] = random.nextInt(limit);
		}
	}

	public abstract void sort();

	public void printArray() {
		StringBuilder builder = new StringBuilder();
		for (int i : array) {
			System.out.print(i + " ");
			builder.append("---");
		}
		System.out.println("\n" + builder);
	}
}
