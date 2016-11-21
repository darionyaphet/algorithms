package org.darion.game;

public class MultiTable {

    private static void fun(int num) {
        if (num == 1) {
            System.out.println(num + " * " + num + " = " + num * num);
        } else {
            fun(num - 1);
            for (int i = 1; i <= num; i++) {
                System.out.println(i + " * " + num + " = " + i * num);
            }
        }
    }

    public static void main(String[] args) {
        fun(9);
    }
}
