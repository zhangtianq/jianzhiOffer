/**
 * @author: ztq
 * @Date: 2018/02/17
 */

/***
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 */
public class Test24 {

    //递归
    public boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return isTreeBST(sequence, 0, sequence.length - 1);
    }

    private boolean isTreeBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]) {
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) {
                return false;
            }
        }
        return isTreeBST(sequence, start, i - 1) && isTreeBST(sequence, i, end - 1);
    }

    //非递归
    public boolean verifySquenceOfBST1(int[] sequence) {
        int len = sequence.length;
        if (len == 0) {
            return false;
        }
        int i = 0;
        while ((--len) > 0) {
            while (sequence[i] < sequence[len]) {
                i++;
            }
            while (sequence[i] > sequence[len]) {
                i++;
            }
            if (i < len) {
                return false;
            }
            i = 0;
        }
        return true;
    }

}
