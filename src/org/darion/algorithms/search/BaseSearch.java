package org.darion.algorithms.search;

import java.util.Arrays;
import java.util.Random;

public abstract class BaseSearch {
	protected int[] array;
	private int size;

	public BaseSearch(int size, int limit) {
		this.size = size;
		array = new int[size];
		Random random = new Random(System.currentTimeMillis());

		for (int index = 0; index < size; index++) {
			array[index] = random.nextInt(limit);
		}
	}

	public void ordered() {
		Arrays.sort(array);
	}

	public int pickOne() {
		Random random = new Random(System.currentTimeMillis());
		return array[random.nextInt(size)];
	}

	public abstract boolean search(int element) throws InterruptedException;

	public void printArray() {
		StringBuilder builder = new StringBuilder();
		for (int i : array) {
			System.out.print(i + " ");
			builder.append("---");
		}
		System.out.println("\n" + builder);
	}
}
