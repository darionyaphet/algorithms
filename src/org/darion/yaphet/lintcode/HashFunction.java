package org.darion.yaphet.lintcode;

import java.math.BigInteger;

public class HashFunction {
	/**
	 * @param key
	 *            : A String you should hash
	 * @param HASH_SIZE
	 *            : An integer
	 * @return an integer
	 */
	public int hashCode(char[] key, int HASH_SIZE) {
		// write your code here
		// long sum = 0;
		BigInteger sum = BigInteger.ZERO;
		int size = key.length - 1;

		for (int index = 0; index < key.length; index++) {
			// sum += (key[index]) * Math.pow(33, size - index);
			// BigInteger base = new BigInteger(index+)
			// BigInteger integer =
			
			for (int j = 0; j < size - index; j++) {
				
			}
			sum = sum.multiply(new BigInteger((key[index])
					* Math.pow(33, size - index) + ""));
			// System.out.println((int) key[index] + "\t" + "33^" + (size -
			// index)
			// + " --> " + sum);
		}

		return sum.mod(new BigInteger(HASH_SIZE + "")).intValue();
	}

	public static void main(String[] args) {
		HashFunction function = new HashFunction();
		System.out.println(function.hashCode(
				"abcdefghijklmnopqrstuvwxyz".toCharArray(), 2607));
	}
}
