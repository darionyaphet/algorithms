package org.darion.yaphet.leetcode;

import java.util.LinkedList;
import java.util.List;

public class SubstringwithConcatenationofAllWords {

	private static final String S = "";
	private static final String[] L = {};

	public List<Integer> findSubstring(String S, String[] L) {
		List<Integer> list = new LinkedList<Integer>();
		return list;
	}

	public static void main(String[] args) {
		SubstringwithConcatenationofAllWords instance = new SubstringwithConcatenationofAllWords();
		List<Integer> indexs = instance.findSubstring(S, L);
		for (Integer index : indexs) {
			System.out.println(index);
		}
	}
}
