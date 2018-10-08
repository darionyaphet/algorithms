package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/climbing-stairs/
 */
public class ClimbingStairs {
//    public static int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }
//    }


    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        int one = 0;
        int two = 1;
        while (n > 0) {
            two = one + two;
            one = two - one;
            n--;
        }
        return two;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(0));
    }
}
