/**
 * @author: ztq
 * @Date: 2018/02/17
 */

/***
 * 输入一个整型数组。数组里有正数也有负数。
 * 数组中一个或连续的多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)
 */
public class Test31 {

    //动态规划
    public int findGreatestSumOfSubArray(int[] array) {
        int local = array[0];
        int global = array[0];
        for (int i = 1; i < array.length; i++) {
            local = Math.max(array[i], array[i] + local);
            global = Math.max(local, global);
        }
        return global;
    }
}
