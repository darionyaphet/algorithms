package org.darion.yaphet.lintcode;

public class DeleteDigits {
    public String DeleteDigits(String A, int l) {
        if (A == null || A.length() == 0) {
            return "";
        }

        StringBuffer buffer = new StringBuffer(A);
        for (int i = 0; i < l; i++) {
            int j;
            for (j = 0; j < buffer.length() - 1
                    && buffer.charAt(j) <= buffer.charAt(j + 1); j++) {
            }
            buffer.delete(j, j + 1);
        }

        while (buffer.length() > 1 && buffer.charAt(0) == '0')
            buffer.delete(0, 1);

        return buffer.toString();
    }

    public static void main(String[] args) {
        DeleteDigits instance = new DeleteDigits();
        System.out.println(instance.DeleteDigits("178542", 4));
    }
}
