/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 统计一个数字在排序数组中出现的次数。
 */
public class Test38 {

    public int getNumberOfK(int[] array, int k) {
        int count = 0;
        if (array != null) {
            int first = getFirstK(array, 0, array.length - 1, k);
            int last = getLastK(array, 0, array.length - 1, k);
            if (first > -1 && last > -1) {
                count = last - first + 1;
            }
        }
        return count;
    }

    private int getFirstK(int[] array, int start, int end, int k) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int midData = array[mid];
        if (midData > k) {
            end = mid - 1;
        } else if (midData < k) {
            start = mid + 1;
        } else {
            if (mid > 0 && array[mid - 1] != k || mid == 0) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return getFirstK(array, start, end, k);
    }

    private int getLastK(int[] array, int start, int end, int k) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int midData = array[mid];
        if (midData > k) {
            end = mid - 1;
        } else if (midData < k) {
            start = mid + 1;
        } else {
            if (mid < array.length - 1 && array[mid + 1] != k || mid == array.length - 1) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return getLastK(array, start, end, k);
    }
}
