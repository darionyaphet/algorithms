package org.darion.yaphet.lintcode;

import java.util.ArrayList;

/**
 * http://www.lintcode.com/zh-cn/problem/restore-ip-addresses/
 * 
 * @author darion.johannes.yaphet
 *
 */
public class RestoreIPAddresses {
	/**
	 * @param s
	 *            the IP string
	 * @return All possible valid IP addresses
	 */
	public ArrayList<String> restoreIpAddresses(String s) {
		ArrayList<String> list = new ArrayList<>();
		if (Long.valueOf(s) < 255) {

		} else {

		}
		return list;
	}

	public static void main(String[] args) {
		final String input = "25525511135";
		System.out.println(Long.valueOf(input));
		RestoreIPAddresses instance = new RestoreIPAddresses();
		System.out.println(instance.restoreIpAddresses(input));
	}
}
