/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0
 */
public class Test49 {
    public int strToInt(String str) {
        int index = 0;
        int sign = 1;
        int digit = 0;
        int total = 0;
        char ch;
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            if (str.charAt(index) == '+')
                sign = 1;
            else {
                sign = -1;
            }
            index++;
        }
        while (index < str.length()) {
            ch = str.charAt(index);
            if (ch < '0' || ch > '9') {
                total = 0;
                break;
            }
            digit = ch - '0';
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total * 10 + digit;
            index++;

        }
        return sign * total;
    }
}
