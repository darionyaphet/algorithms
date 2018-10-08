package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/strstr/
 */
public class Strstr {

    public static int strStr(String source, String target) {

//(source == null || source.length() == 0) ||
        if (target != null && target.length() == 0) {
            return 0;
        }

        if (source == null || target == null) {
            return -1;
        }

        for (int i = 0; i < source.length(); i++) {
            boolean found = true;
            for (int j = 0; j < target.length(); j++) {
                if (i + j >= source.length()) {
                    return -1;
                }

                if (source.charAt(i + j) != target.charAt(j)) {
                    found = false;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("source", "target"));
        System.out.println(strStr("abcdabcdefg", "bcd"));
        System.out.println(strStr("lintcode", "lintcode"));
        System.out.println(strStr("", "a"));
        System.out.println(strStr("a", ""));
    }
}
