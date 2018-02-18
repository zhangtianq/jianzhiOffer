/**
 * @author: ztq
 * @Date: 2018/02/14
 */

/***
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Test09_3 {

    public int rectCover(int target) {
        if (target <= 0) {
            return 0;
        } else if (target == 1 || target == 2) {
            return target;
        } else {
            return rectCover(target - 1) + rectCover(target - 2);
        }
    }
}
