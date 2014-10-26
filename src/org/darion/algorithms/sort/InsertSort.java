package org.darion.algorithms.sort;

public class InsertSort extends BaseSort {

	public InsertSort(int size, int limit) {
		super(size, limit);
	}

	@Override
	public void sort() {

	}

	public static void main(String[] args) {
		InsertSort sort = new InsertSort(20, 1024);
		sort.printArray();
		sort.sort();
		sort.printArray();
	}
}
