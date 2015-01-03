package org.darion.yaphet.algorithm;

/* 第八章 动态规划 计算二项式系数 */
public class BinoCoeff {

	public static void main(String[] args) {
		int result = Binomial(8, 3);
		System.out.println("输出8的二项式系数：");
		for (int i = 0; i <= 8; i++) {
			System.out.println("C" + "(" + 8 + "," + i + ")" + " ———— "
					+ Binomial(8, i));
			System.out.println();
		}
	}

	public static int Binomial(int n, int k) {
		// 计算二项式系数C(n,k)
		int[][] result = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) // 按行来填矩阵
		{
			for (int j = 0; j <= min(i, k); j++) // min(i,k)是这一行需要填的列数
			{
				// if(j == 0 || j == k)//书上写错了，他妈的
				if (j == 0 || j == i) {
					result[i][j] = 1;
				} else {
					result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
				}
			}
		}

		return result[n][k];
	}

	private static int min(int i, int k) {
		if (i < k) {
			return i;
		}
		return k;
	}
}
