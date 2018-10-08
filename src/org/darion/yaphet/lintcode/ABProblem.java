package org.darion.yaphet.lintcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/a-b-problem/
 */
public class ABProblem {

    public static int aplusb(int a, int b) {
        List<Integer> aList = new LinkedList<>();
        List<Integer> bList = new LinkedList<>();

        while (a != 0) {
            aList.add(a % 10);
            a /= 10;
        }

        while (b != 0) {
            bList.add(b % 10);
            b /= 10;
        }

        int size;
        int smaller;

//        System.out.println(Arrays.toString(aList.toArray()));
//        System.out.println(Arrays.toString(bList.toArray()));

        boolean AIsBiggerThanB;
        if (aList.size() > bList.size()) {
            size = aList.size();
            smaller = bList.size();
            AIsBiggerThanB = true;
        } else {
            size = bList.size();
            smaller = aList.size();
            AIsBiggerThanB = false;
        }

        int[] result = new int[size + 1];
        boolean carryOver = false;
        for (int i = 0; i < smaller; i++) {
            if (carryOver) {
                result[i] = 1 + ((aList.get(i) + bList.get(i)) % 10);
            } else {
                result[i] = (aList.get(i) + bList.get(i)) % 10;
            }

            if ((aList.get(i) + bList.get(i)) >= 10) {
                carryOver = true;
            } else {
                carryOver = false;
            }
        }

        if (carryOver) {
            result[smaller] = 1;
        }

        for (int i = smaller; i < size; i++) {
            if (AIsBiggerThanB) {
                if (carryOver) {
                    result[i] += (aList.get(i) + 1) % 10;
                    if ((aList.get(i) + 1) >= 10) {
                        result[size] = 1;
                    }
                } else {
                    result[i] += aList.get(i);
                }
            } else {
                if (carryOver) {
                    result[i] += (bList.get(i) + 1) % 10;
                    if ((bList.get(i) + 1) >= 10) {
                        result[size] = 1;
                    }
                } else {
                    result[i] += bList.get(i);
                }
            }
        }

        int sum = result[0];
        for (int i = 1; i <= size; i++) {
            sum += result[i] * Math.pow(10, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(aplusb(90, 10));
    }
}
