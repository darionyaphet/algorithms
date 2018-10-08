package org.darion.yaphet.lintcode;

public class DarionQueen8 {

    int max = 4;
    int[] array = new int[max];

    private void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + 1 + " ");
        }
        System.out.println();
        System.out.println("\n\n");
    }

    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n]) {
                System.out.println("Column Conflict " + array[i] + ":" + array[n]);
                return false;
            }

            if (Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                System.out.println("Diagonal Conflict " + i + ":" + array[i] + "\t" + n + ":" + array[n]);
                return false;
            }
        }
        return true;
    }

    private void check(int row) {
        if (row == max) {
            print();
            return;
        }

        for (int column = 0; column < max; column++) {
            System.out.println("Begin test Row : " + row + " Column : " + column);
            array[row] = column;
            if (judge(row)) {
                System.out.println("Check Success Row : " + row);
                check(row + 1);
            } else {
                System.out.println("Check Failed Row : " + row);
            }
        }
    }


    public static void main(String[] args) {
        DarionQueen8 instance = new DarionQueen8();
        instance.check(0);
    }
}
