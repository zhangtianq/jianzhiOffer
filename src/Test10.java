/**
 * @author: ztq
 * @Date: 2018/02/14
 */

/***
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Test10 {

    //将一个数和它减一的数进行与运算，相当于把这个数最右边的1置为0
    //如1100和1011与运算得到1000，多少次这种运算，就说明有多少个1
    public int numberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
