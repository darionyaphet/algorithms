package org.darion.algorithms.sort;

public class BubbleSort extends BaseSort {

	public BubbleSort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {

	}

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort(20, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}
}
