/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Test34 {

    public int getUglyNumber_Solution(int index) {
        //1~6全是丑数
        if (index < 7) {
            return index;
        }
        int[] array = new int[index];
        int t2 = 0, t3 = 0, t5 = 0;
        array[0] = 1;
        for (int i = 1; i < index; i++) {
            array[i] = Math.min(array[t2] * 2, Math.min(array[t3] * 3, array[t5] * 5));
            if (array[i] == array[t2] * 2) {
                t2++;
            }
            if (array[i] == array[t3] * 3) {
                t3++;
            }
            if (array[i] == array[t5] * 5) {
                t5++;
            }
        }
        return array[index - 1];
    }
}
