package org.darion.yaphet.lintcode;

public class Queen8 {
//    public int num = 0;
//    public static final int MAX_QUEEN = 4;
//    public int[] cols = new int[MAX_QUEEN];
//
//    public void solve(int num) {
//        boolean[] rows = new boolean[MAX_QUEEN];
//        for (int i = 0; i < num; i++) {
//            rows[cols[i]] = true;
//            int d = num - i;
//            if (cols[i] - d >= 0) rows[cols[i] - d] = true;
//            if (cols[i] + d <= MAX_QUEEN - 1) rows[cols[i] + d] = true;
//        }
//        for (int i = 0; i < MAX_QUEEN; i++) {
//            if (rows[i]) continue;
//            cols[num] = i;
//            if (num < MAX_QUEEN - 1) {
//                solve(num + 1);
//            } else {
//                num++;
//                printChessBoard();
//            }
//        }
//    }
//
//    public void printChessBoard() {
//
//        System.out.println("第" + num + "种走法 ");
//        for (int i = 0; i < MAX_QUEEN; i++) {
//            for (int j = 0; j < MAX_QUEEN; j++) {
//                if (i == cols[j]) {
//                    System.out.print("0 ");
//                } else
//                    System.out.print("+ ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        Queen8 instance = new Queen8();
//        instance.solve(4);
//        System.out.println(instance.num);
//    }

    public static int num = 0; //累计方案总数
    public static final int MAXQUEEN = 4;//皇后个数，同时也是棋盘行列总数
    public static int[] cols = new int[MAXQUEEN]; //定义cols数组，表示8列棋子摆放情况

    public void solve() {
        getArrangement(0);
        System.out.print("/n");
        System.out.println(MAXQUEEN + "皇后问题有" + num + "种摆放方法。");
    }

    public void getArrangement(int n) {
        System.out.println("N : " + n);

        //遍历该列所有不合法的行，并用rows数组记录，不合法即rows[i]=true
        boolean[] rows = new boolean[MAXQUEEN];
        for (int i = 0; i < n; i++) {
            rows[cols[i]] = true;
            int d = n - i;
            if (cols[i] - d >= 0)
                rows[cols[i] - d] = true;
            if (cols[i] + d <= MAXQUEEN - 1)
                rows[cols[i] + d] = true;
        }

        for (int i = 0; i < MAXQUEEN; i++) {
            //判断该行是否合法
            if (rows[i])
                continue;

            //设置当前列合法棋子所在行数
            cols[n] = i;

            if (n < MAXQUEEN - 1) {
                getArrangement(n + 1);
            } else {
                num++;
                printChessBoard();
            }
        }
    }

    public void printChessBoard() {
        System.out.println("第" + num + "种走法 ");
        for (int i = 0; i < MAXQUEEN; i++) {
            for (int j = 0; j < MAXQUEEN; j++) {
                if (i == cols[j]) {
                    System.out.print("0 ");
                } else
                    System.out.print("+ ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    public static void main(String args[]) {
        Queen8 instance = new Queen8();
        instance.solve();
    }
}
