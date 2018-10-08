package org.darion.yaphet.lintcode;

import java.util.Arrays;

public class InterleavingPositiveAndNegativeNumbers {
    public void rerange(int[] A) {
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                positive += 1;
            } else if (A[i] < 0) {
                negative += 1;
            }
        }

        int[] positiveArray = new int[positive];
        int[] negativeArray = new int[negative];
        positive = 0;
        negative = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                positiveArray[positive++] = A[i];
            } else if (A[i] < 0) {
                negativeArray[negative++] = A[i];
            }
        }

//        System.out.println(Arrays.toString(positiveArray));
//        System.out.println(Arrays.toString(negativeArray));
        positive = 0;
        negative = 0;

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (negative < negativeArray.length) {
                    A[i] = negativeArray[negative++];
                } else {
                    A[i] = positiveArray[positive++];
                }
            } else {
                if (positive < positiveArray.length) {
                    A[i] = positiveArray[positive++];
                }else{
                    A[i] = negativeArray[negative++];
                }
            }
        }
    }

    public static void main(String[] args) {
//        int[] array = {-1, -2, -3, 4, 5, 6};
        int[] array = {28, 2, -22, -27, 2, 9, -33, -4, -18, 26, 25, 34, -35, -17, 2, -2, 32, 35, -8};
        InterleavingPositiveAndNegativeNumbers instance = new InterleavingPositiveAndNegativeNumbers();
        instance.rerange(array);
        System.out.println(Arrays.toString(array));
    }
}
