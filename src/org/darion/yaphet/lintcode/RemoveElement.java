package org.darion.yaphet.lintcode;

import java.util.Arrays;

/**
 * https://www.lintcode.com/zh-cn/problem/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int size = 0 ;
        int i = 0;
        for (int index = 0; index < A.length; index++) {
            if (A[index] != elem) {
                size++;
                A[i++] = A[index];
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[] array = {0, 4, 4, 0, 0, 2, 4, 4};
        RemoveElement instance = new RemoveElement();
        System.out.println(instance.removeElement(array, 4));
        System.out.println(Arrays.toString(array));

//        int[] array = {0, 4, 4, 0, 4, 4, 4, 0, 2};
//        RemoveElement instance = new RemoveElement();
//        System.out.println(instance.removeElement(array, 4));
//        System.out.println(Arrays.toString(array));
    }
}
