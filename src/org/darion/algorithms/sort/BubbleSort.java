package org.darion.algorithms.sort;

public class BubbleSort extends BaseSort {

	public BubbleSort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {
		for (int i = 0; i < array.length; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					int tmp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort(20, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}
}
