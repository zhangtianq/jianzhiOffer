/**
 * @author: ztq
 * @Date: 2018/02/18
 */

import java.util.ArrayList;

/***
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数
 * 使得它们的和正好是s。如果有多对数字的和等于s，输出任意一对即可
 */
public class Test41 {

    public boolean findContinuousSequence(int[] array, int sum) {
        boolean found = false;
        if (array == null) {
            return found;
        }
        int start = 0, end = array.length - 1;
        int num1 = 0, num2 = 0;
        while (start < end) {
            int cur = array[start] + array[end];
            if (cur == sum) {
                num1 = array[start];
                num2 = array[end];
                found = true;
                break;
            } else if (cur > sum) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(num1);
        System.out.println(num2);
        return found;
    }

}
