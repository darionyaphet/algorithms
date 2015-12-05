package org.darion.algorithms.sort;

public class InsertSort extends BaseSort {

	public InsertSort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {
		for (int index = 1; index < array.length; index++) {
			int element = array[index];
			int pivot;
			for (pivot = index - 1; pivot >= 0; pivot--) {
				if (array[pivot] > element) {
					array[pivot + 1] = array[pivot];
				} else {
					break;
				}
			}
			array[pivot + 1] = element;
		}
	}

	public static void main(String[] args) {
		InsertSort sort = new InsertSort(20, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}
}
