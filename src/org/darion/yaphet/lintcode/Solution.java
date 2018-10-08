package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/singleton/
 */
public class Solution {

    private static Solution INSTANCE = null;

    public static Solution getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Solution();
        }
        return INSTANCE;
    }

    private Solution() {

    }
}
