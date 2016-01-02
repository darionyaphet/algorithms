package org.darion.yaphet.leetcode;

public class RemoveElement {

	public int removeElement(int[] A, int elem) {
		if (A == null || A.length == 0) {
			return 0;
		}

		int size = A.length;
		for (int element : A) {
			if (element == elem) {
				size -= 1;
			}
		}
		return size;
	}

	public static void main(String[] args) {
		int[] array = { 4, 5 };
		RemoveElement element = new RemoveElement();
		System.out.println(element.removeElement(array, 4));
	}
}
