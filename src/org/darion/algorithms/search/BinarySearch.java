package org.darion.algorithms.search;

public class BinarySearch extends BaseSearch {

	public BinarySearch(int size, int limit) {
		super(size, limit);
	}

	@Override
	public boolean search(int element) throws InterruptedException {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (element < array[middle]) {
				right = middle - 1;
				System.out.println("Right --> " + right);
				Thread.sleep(1000);
			} else if (element > array[middle]) {
				left = middle + 1;
				System.out.println("Left -->  " + left);
				Thread.sleep(1000);
			} else {
				System.out.println("\\(^o^)/ Get " + element);
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) throws InterruptedException {
		BinarySearch search = new BinarySearch(18, 1024);
		search.ordered();
		search.printArray();
		int element = search.pickOne();
		System.out.println("Pick One : " + element);
		search.search(element);
	}
}
