package org.darion.yaphet.leetcode;

/**
 * https://leetcode.com/problems/add-digits/
 *
 * @author darion.yaphet
 */
public class AddDigits {

    public int addDigits(int num) {
        int result = num;
        int sum ;

        while (result >= 10) {
            sum = 0;
            do {
                sum += result % 10;
                result /= 10;
            } while (result > 0);

            result = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        AddDigits instance = new AddDigits();
        System.out.println(instance.addDigits(10));
    }
}
