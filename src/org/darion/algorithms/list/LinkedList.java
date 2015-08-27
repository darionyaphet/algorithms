package org.darion.algorithms.list;

public class LinkedList {
	private String[] array;
	private int current = 0;
	private int removed = 0;

	public LinkedList(int size) {
		array = new String[size];
	}

	public void add(String element) {
		if (current < array.length) {
			array[current++] = element;
		} else {
			String[] newArray = new String[array.length * 2];
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
			array[current++] = element;
		}
	}

	public void remove() {
		removed++;
	}

	public void release() {
		
	}

	public void print() {
		int limit = array.length - 1;
		for (int index = removed; index < limit; index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.println(array[limit]);
	}
}
