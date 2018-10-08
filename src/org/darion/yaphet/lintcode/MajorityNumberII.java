package org.darion.yaphet.lintcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * http://www.lintcode.com/zh-cn/problem/majority-number-ii/
 */
public class MajorityNumberII {

    public int majorityNumber(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return -1;
        }

        int limit = nums.size() / 3;
//        System.out.println("limit " + limit);
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.size(); index++) {
            int number = nums.get(index);
            if (map.containsKey(number)) {
                int value = map.get(number) + 1;
                map.put(number, value);
            } else {
                map.put(number, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > limit) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 1, 3, 3};
        List<Integer> numbers = new LinkedList<>();
        for (Integer integer : array) {
            numbers.add(integer);
        }

        MajorityNumberII instance = new MajorityNumberII();
        System.out.println(instance.majorityNumber(numbers));
    }
}
