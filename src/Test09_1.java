/**
 * @author: ztq
 * @Date: 2018/02/14
 */

/***
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Test09_1 {

    public int jumpFloor(int target) {
        if (target <= 0) {
            return 0;
        } else if (target == 1 || target == 2) {
            return target;
        } else {
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }
}
