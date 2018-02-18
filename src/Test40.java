/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class Test40 {

    public void findNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array == null || array.length < 2) {
            return;
        }
        int tmp = 0;
        for (int i : array) {
            tmp ^= i;
        }
        int index = getFirstBitOf1(tmp);
        for (int i = 0; i < array.length; i++) {
            if (isBit(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    private int getFirstBitOf1(int num) {
        int index = 0;
        while ((num & 1) == 0 && index < 32) {
            index++;
            num = num >> 1;
        }
        return index;
    }

    private boolean isBit(int num, int index) {
        num = num >> index;
        if ((num & 1) == 1) {
            return true;
        }
        return false;
    }
}
