package org.darion.algorithms.dynamic.programming;

/**
 * http://blog.csdn.net/mu399/article/details/7722810
 * 
 * f[i,j] = Max{ f[i-1,j-Wi]+Pi( j >= Wi ), f[i-1,j] }
 * 
 * f[i,j]表示在前i件物品中选择若干件放在承重为 j 的背包中，可以取得的最大价值。
 * 
 * Pi表示第i件物品的价值。
 * 
 * 决策：为了背包中物品总价值最大化，第 i件物品应该放入背包中吗 ？
 * 
 * 
 * 有编号分别为a,b,c,d,e的五件物品，它们的重量分别是2,2,6,5,4，它们的价值分别是6,3,5,4,6
 * 现在给你个承重为10的背包，如何让背包里装入的物品具有最大的价值总和？
 * 
 * @author Darion.Yaphet
 *
 */
public class Package01 {
	public static void main(String[] args) {

	}
}
