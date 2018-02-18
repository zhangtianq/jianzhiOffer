/**
 * @author: ztq
 * @Date: 2018/02/17
 */

/***
 * 输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。
 * 例如输入12，从1到12这些整数中包含1的数字有1,10,11和12，
 * 1一共出现了5次
 */
public class Test32 {

    public int numberOf1Between1AndN_Solution(int n) {
        int count = 0;
        int i = 1;
        int current = 0, after = 0, before = 0;
        while ((n / i) != 0) {
            current = (n / i) % 10;  //当前位数字
            before = n / (i * 10);  //高位数字
            after = n - (n / i) * i;  //低位数字
            if (current > 1) {
                count = count + (before + 1) * i;
            } else if (current == 0) {
                count = count + before * i;
            } else if (current == 1) {
                count = count + before * i + after + 1;
            }
            i *= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Test32().numberOf1Between1AndN_Solution(12));
    }
}
