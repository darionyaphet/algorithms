package org.darion.game;

public class Queen {

    static final int QUEEN_MAX = 8;   //皇后的数量
    int[][] queenCount = new int[QUEEN_MAX][QUEEN_MAX];//分配8X8的数组，充当棋盘，存放皇后
    int resultCount = 0;//记录皇后的放置方法的总数
    int[] queenPlace = new int[QUEEN_MAX];//存放每行的皇后位置即第column行的皇后放置位置是Queenplace[column]

    public void putQueen(int row) {

        for (int column = 0; column < QUEEN_MAX; column++) { //column表示列标
            if (queenCount[row][column] == 0) { //row行、column列可以放皇后

                for (int rowi = row + 1; rowi < QUEEN_MAX; rowi++) {  //for循环的作用是使其斜下方和正下方不为0
                    queenCount[rowi][column]++;
                    if (column - rowi + row >= 0) {
                        queenCount[rowi][column - rowi + row]++;
                    }
                    if (column + rowi - row < QUEEN_MAX) {
                        queenCount[rowi][column + rowi - row]++;
                    }
                }

                queenPlace[row] = column;//row行column列放了皇后
                if (row == QUEEN_MAX - 1) { //皇后已放满，打印出皇后布局
                    printQueen(++resultCount);
                } else { //否则继续排列下一行皇后
                    putQueen(row + 1);
                }

                for (int rows = row + 1; rows < QUEEN_MAX; rows++) {  //回溯，在此行的皇后不放此列column ，恢复该位置的正下面/斜下面的count
                    queenCount[rows][column]--;
                    if (column - rows + row >= 0) {
                        queenCount[rows][column - rows + row]--;
                    }
                    if (column + rows - row < QUEEN_MAX) {
                        queenCount[rows][column + rows - row]--;
                    }
                }
            }
        }
        if (row == 0) {
            System.out.println(QUEEN_MAX + "皇后问题共有" + resultCount + "个解.");
        }
    }

    private void printQueen(int size) {
        System.out.println(QUEEN_MAX + "皇后的第" + size + "个解是:\n");
        for (int row = 0; row < QUEEN_MAX; row++) {
            for (int column = 0; column < QUEEN_MAX; column++) {
                System.out.print(queenPlace[row] == column ? " * " : " - ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.putQueen(0);
    }
}
