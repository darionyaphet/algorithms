package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/fizz-buzz/
 */
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add(i - 1, "fizz buzz");
            } else if (i % 3 == 0) {
                list.add(i - 1, "fizz");
            } else if (i % 5 == 0) {
                list.add(i - 1, "buzz");
            } else {
                list.add(i - 1, String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
