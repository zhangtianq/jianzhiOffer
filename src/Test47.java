/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
 */
public class Test47 {

    public int add(int num1,int num2) {
        while (num2 != 0) {
            //两数相加，不算进位
            int tmp = num1 ^ num2;
            //计算进位
            num2 = (num1 & num2) << 1;
            //num1存放刚才两数相加的结果
            num1 = tmp;
        }
        return num1;
    }
}
