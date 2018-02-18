/**
 * @author: ztq
 * @Date: 2018/02/14
 */

/***
 * 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 */
public class Test11 {

    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        int k = exponent;
        k = k < 0 ? -k : k;
        double result = power(base, k >> 1);
        result *= result;
        if ((exponent & 0x1) == 1) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}
