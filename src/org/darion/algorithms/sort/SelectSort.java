package org.darion.algorithms.sort;

public class SelectSort extends BaseSort {
	public SelectSort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {
		int tmp;
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
	}

	public static void main(String[] args) {
		SelectSort sort = new SelectSort(20, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}

}
