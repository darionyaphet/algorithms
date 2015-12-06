package org.darion.algorithms.search;

public class FibonacciSearch extends BaseSearch {

	public FibonacciSearch(int size, int limit) {
		super(size, limit);
	}

	@Override
	public boolean search(int element) throws InterruptedException {
		return false;
	}

	public static void main(String[] args) throws InterruptedException {
		FibonacciSearch search = new FibonacciSearch(18, 1024);
		search.ordered();
		search.printArray();
		int element = search.pickOne();
		System.out.println("Pick One : " + element);
		search.search(element);
	}
}
