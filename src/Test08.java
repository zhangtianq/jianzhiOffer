/**
 * @author: ztq
 * @Date: 2018/02/13
 */

import java.util.HashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Lock;

/***
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Test08 {

    public static int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int start = 0;
        int end = array.length - 1;
        int mid = start;
        while (array[start] >= array[end]) {
            if (end - start == 1) {
                mid = end;
                break;
            }
            mid = (start + end) / 2;

            //如果下标为start、end、mid指向的是三个数相等。
            //如10111  11101这样的，无法判断中间数位于前面子数组还是后面子数组
            //则只能顺序查找
            if (array[start] == array[end] && array[mid] == array[start]) {
                return minInOrder(array, start, end);
            }

            if (array[mid] >= array[start]) {
                start = mid;
            } else if (array[mid] <= array[end]) {
                end = mid;
            }
        }
        return array[mid];
    }

    private static int minInOrder(int[] array, int start, int end) {
        int result = array[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }

}
