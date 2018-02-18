/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 求1+2+3+...+n，
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句 A?B:C
 */
public class Test46 {

    public int sum_Solution(int n) {
        int sum = n;
        //当n=0时，由于短路，只判断n>0，返回false，使递归终止
        boolean ans = (n > 0) && ((sum += sum_Solution(n - 1)) > 0);
        return sum;
    }
}
