/**
 * @author: ztq
 * @Date: 2018/02/17
 */

/***
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Test14 {

    //类似于冒泡排序
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = array.length - 1; i > 0 ; i--) {
                if (array[i - 1] % 2 == 0 && array[i] % 2 == 1) {
                    int tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;
                    flag = true;
                }
            }
        }
    }

    //不要求相对位置不变，只需左边奇数右边偶数就可以
    public void reOrderArray1(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int start = 0, end = array.length - 1;
        while (start < end) {
            while (start < end && !isEven(array[start])) {
                start++;
            }
            while (start < end && isEven(array[end])) {
                end--;
            }
            if (start < end) {
                int tmp = array[start];
                array[start] = array[end];
                array[end] = tmp;
            }
        }
    }

    private boolean isEven(int n) {
        return n % 2 == 0;
    }

}
