package org.darion.yaphet.lintcode;

public class Sqrtx {
    public int sqrt(int x) {
//        if ( x == 1 || x == 2) {
//            return 1;
//        }
//
//        for (int i = 1; i <= x; i++) {
//            if (i * i > x) {
//                return i - 1;
//            } else if (i * i == x) {
//                return i;
//            }
//        }
//        return 1;

        int low = 0, high = x;
        while (low <= high) {
            System.out.println(low + "  " + high);
            int mid = low + (high - low) / 2;
            long square = (long) mid * (long) mid;
            long square1 = (long) (mid + 1) * (long) (mid + 1);
            long square2 = (long) (mid - 1) * (long) (mid - 1);

            if (square == x)
                return mid;

            if (square < x && square1 > x)
                return mid;

            if (square > x && square2 < x)
                return mid - 1;

            if (square < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Sqrtx instance = new Sqrtx();
//        System.out.println(instance.sqrt(3));
//        System.out.println(instance.sqrt(4));
//        System.out.println(instance.sqrt(5));
        System.out.println(instance.sqrt(2147483647));
    }
}
