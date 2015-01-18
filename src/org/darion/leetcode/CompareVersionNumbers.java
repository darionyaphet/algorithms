package org.darion.leetcode;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		String[] version1s = version1.split("\\.");
		String[] version2s = version2.split("\\.");
		int size = version1s.length > version2s.length ? version1s.length
				: version2s.length;

		for (int index = 0; index < size; index++) {
			Integer v1 = index < version1s.length ? Integer
					.valueOf(version1s[index]) : 0;
			Integer v2 = index < version2s.length ? Integer
					.valueOf(version2s[index]) : 0;

			int result = v1.compareTo(v2);
			if (result != 0) {
				return result;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		CompareVersionNumbers versionNumbers = new CompareVersionNumbers();
		System.out.println(versionNumbers.compareVersion("1.0", "1.1"));
	}
}
