package org.darion.yaphet.leetcode;

import java.util.List;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		return null;
	}

	public static void main(String[] args) {
		final String string = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		
		RepeatedDNASequences sequences = new RepeatedDNASequences();
		List<String> list = sequences.findRepeatedDnaSequences(string);

		for (String token : list) {
			System.out.println(token);
		}
	}
}
