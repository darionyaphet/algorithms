package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/space-replacement/
 */
public class SpaceReplacement {

    public static int replaceBlank(char[] string, int length) {
        int newLength = length;
        int space = 0;
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ')
                space++;
        }
        newLength = newLength + space * 2;
        int index = newLength;
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[--index] = '0';
                string[--index] = '2';
                string[--index] = '%';
            } else
                string[--index] = string[i];
        }
        return newLength;
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(replaceBlank(input.toCharArray(), 11));
    }
}
