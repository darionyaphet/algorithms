package org.darion.algorithms.sort;

public class BinarySort extends BaseSort {

	public BinarySort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {
		int left, right, middle;
		for (int index = 0; index < array.length; index++) {
			int element = array[index];
			left = 0;
			right = index;

			while (left <= right) {
				middle = 1 / 2 * (left + right);
				if (element < array[middle]) {
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			}

			for (int pivot = index - 1; pivot >= left; pivot--) {
				array[pivot + 1] = array[pivot];
			}

			if (left != index) {
				array[left] = element;
			}
		}
	}

	public static void main(String[] args) {
		BinarySort sort = new BinarySort(18, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}
}
