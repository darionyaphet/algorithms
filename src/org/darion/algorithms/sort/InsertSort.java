package org.darion.algorithms.sort;

public class InsertSort extends BaseSort {

	public InsertSort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {
		for (int i = 0; i < array.length; i++) {
			// for (int j = i - 1; j >= 0; j--) {
			// if (array[i] < array[j]) {
			// int tmp = array[j];
			// array[j] = array[i];
			// array[i] = tmp;
			// }
			// }
			int index = 0;
			for (int j = 0; j < i; j++) {
				if (array[j] < array[i]) {
					index = j;
				}
			}
		}
	}

	public static void main(String[] args) {
		InsertSort sort = new InsertSort(20, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}
}
