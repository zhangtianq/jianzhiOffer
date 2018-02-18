/**
 * @author: ztq
 * @Date: 2018/02/14
 */

/***
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 n<=39
 */
public class Test09 {

    public int fibonacci(int n) {
        int[] array = new int[40];
        array[0] = 0;
        array[1] = array[2] = 1;
        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}

