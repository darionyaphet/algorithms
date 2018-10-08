package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/hash-function/
 */
public class HashFunction {
    public static int hashCode(char[] key, int HASH_SIZE) {
        if (key == null || key.length == 0) {
            return -1;
        }

        int size = key.length;

        long code = 0;
        long base = 1;

        for (int i = size - 1; i >= 0; i--) {
            code += (key[i] * base) % HASH_SIZE;
            code %= HASH_SIZE;
            base = base * 33 % HASH_SIZE;
        }

        return (int) code;
    }

    public static void main(String[] args) {
        System.out.println(hashCode("abcd".toCharArray(), 100));
        System.out.println(hashCode("ubuntu".toCharArray(), 1007));
        System.out.println(hashCode("abcdefghijklmnopqrstuvwxyz".toCharArray(), 2607)); // 1673
    }
}
