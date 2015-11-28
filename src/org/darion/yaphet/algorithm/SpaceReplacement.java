package org.darion.yaphet.algorithm;

public class SpaceReplacement {

	private static final Character SPACE = ' ';

	public static void main(String[] args) {
		final String source = "Hello Darion Yaphet";
		int spaceNumber = 0;
		for (Character element : source.toCharArray()) {
			if (SPACE.equals(element)) {
				spaceNumber += 1;
			}
		}

		int index = 0;
		char[] array = new char[source.length() + 2 * spaceNumber];
		for (Character element : source.toCharArray()) {
			if (!SPACE.equals(element)) {
				array[index++] = element;
			} else {
				array[index++] = '%';
				array[index++] = '2';
				array[index++] = '0';
			}
		}

		System.out.println(new String(array));
	}
}
