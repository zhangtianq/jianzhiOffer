/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import java.util.ArrayList;

/***
 *
 */
public class Test30 {

    public ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length || k <= 0) {
            return list;
        }
        int start = 0, end = input.length - 1;
        int index = partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = partition(input, start, end);
            } else {
                start = index + 1;
                index = partition(input, start, end);
            }
        }
        for (int i = 0; i <= index; i++) {
            list.add(input[i]);
        }
        return list;
    }

    private int partition(int[] input, int start, int end) {
        int tmp = input[start];
        while (start < end) {
            while (start < end && input[end] > tmp) {
                end--;
            }
            input[start] = input[end];
            while (start < end && input[start] <= tmp) {
                start++;
            }
            input[end] = input[start];
        }
        input[start] = tmp;
        return start;
    }

}
