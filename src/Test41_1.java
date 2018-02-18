/**
 * @author: ztq
 * @Date: 2018/02/18
 */

import java.util.ArrayList;

/***
 * 输入一个正数s，打印出所有和为s的连续正数序列（至少含有2个数）
 * 例如输入15，由于 1+2+3+4+5 = 4+5+6 = 7+8 = 15
 * 所以结果打印出3个连续序列1~5、4~6、和7~8
 */
public class Test41_1 {

    public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum < 3) {
            return result;
        }
        ArrayList<Integer> list;
        int small = 1, big = 2, mid = (sum + 1) / 2;
        int curSum = small + big;
        while (small < mid) {
            if (curSum == sum) {
                list = new ArrayList<>();
                for (int i = small; i <= big; i++) {
                    list.add(i);
                }
                result.add(list);
                big++;
                curSum += big;
            }
            if (curSum > sum) {
                curSum -= small;
                small++;
            }
            if (curSum < sum) {
                big++;
                curSum += big;
            }
        }
        return result;
    }

}
