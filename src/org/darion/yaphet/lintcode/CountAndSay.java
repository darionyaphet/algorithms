package org.darion.yaphet.lintcode;

import java.util.HashMap;
import java.util.Map;

public class CountAndSay {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            char[] chars = result.toCharArray();
            char c = chars[0];
            int count = 1;
            StringBuilder builder = new StringBuilder();

            for (int index = 1; index < chars.length; index++) {
                if (chars[index] == c) {
                    count += 1;
                } else {
                    builder.append(count);
                    builder.append(c);
                    c = chars[index];
                    count = 1;
                }
            }
            builder.append(count);
            builder.append(c);
            result = builder.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        CountAndSay instance = new CountAndSay();
        System.out.println(instance.countAndSay(3));
    }
}
