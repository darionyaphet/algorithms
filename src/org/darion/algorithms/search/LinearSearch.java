package org.darion.algorithms.search;

public class LinearSearch extends BaseSearch {

	public LinearSearch(int size, int limit) {
		super(size, limit);
	}

	@Override
	public boolean search(int element) {
		for (int index = 0; index < array.length; index++) {
			if (array[index] == element) {
				System.out.println("\\(^o^)/ Get " + element);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LinearSearch search = new LinearSearch(18, 1024);
		search.printArray();
		int element = search.pickOne();
		System.out.println("Pick One : " + element);
		search.search(element);
	}
}
