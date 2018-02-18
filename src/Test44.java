/**
 * @author: ztq
 * @Date: 2018/02/18
 */

import java.util.Arrays;

/***
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。
 * 2~10为数字本身，A为1，J为10，Q为12，K为13，而大小王可以看成任意数字，方便起见，认为大小王是0。
 */
public class Test44 {

    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length < 5) {
            return false;
        }
        Arrays.sort(numbers);

        int zero = 0; //0的个数
        int gap = 0; //间隔的个数

        for (int i : numbers) {
            if (i == 0) {
                zero++;
            }
        }

        for (int i = zero + 1; i < numbers.length; i++) {
            if (numbers[i] - numbers[i - 1] > 1) {
                gap += (numbers[i] - numbers[i - 1] - 1);
            }
            if (numbers[i] - numbers[i - 1] == 0) {
                return false;
            }
        }

        return gap <= zero;
    }

}
