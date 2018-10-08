package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * http://www.lintcode.com/zh-cn/problem/rotate-string/
 */
public class RotateString {
    public static void rotateString(char[] str, int offset) {
        if (str == null || str.length == 0 || offset < 0) {
            return;
        }
        if (offset > str.length) {
            offset = offset % str.length;
        }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length - offset; i++) {
            buffer.append(str[i]);
        }
        buffer = buffer.reverse();
        for (int i = 0; i < offset; i++) {
            buffer.append(str[str.length - 1 - i]);
        }
        String result = buffer.reverse().toString();
        for (int i = 0; i < result.length(); i++) {
            str[i] = result.charAt(i);
        }
    }

    /**
     * offset=0 => "abcdefg"
     * offset=1 => "gabcdef"
     * offset=2 => "fgabcde"
     * offset=3 => "efgabcd"
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] array = "abcdefg".toCharArray();
        rotateString(array, 0);
        System.out.println(Arrays.toString(array));

        rotateString(array, 1);
        System.out.println(Arrays.toString(array));

        rotateString(array, 2);
        System.out.println(Arrays.toString(array));

        rotateString(array, 3);
        System.out.println(Arrays.toString(array));

        //cppjavapy --> pjavapycp
        array = "cppjavapy".toCharArray();
        rotateString(array, 25);
        System.out.println(Arrays.toString(array));

    }
}
