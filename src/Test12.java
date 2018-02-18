/**
 * @author: ztq
 * @Date: 2018/02/17
 */

/***
 * 输入数字n，按顺序打印出从1最大的n位十进制数。
 * 比如输入3，则打印出1、2、3一直到最大的3位数即999
 */
public class Test12 {

    public void printToMaxOfNDigits(int n) {
        int[] array = new int[n];
        if (n <= 0) {
            return;
        }
        printArray(array, 0);
    }

    private void printArray(int[] array, int n) {
        for (int i = 0; i < 10; i++) {
            if (n != array.length) {
                array[n] = i;
                printArray(array, n + 1);
            } else {
                boolean isFirstNo0 = false;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != 0) {
                        System.out.print(array[j]);
                        if (!isFirstNo0) {
                            isFirstNo0 = true;
                        }
                    } else {
                        if (isFirstNo0) {
                            System.out.print(array[j]);
                        }
                    }
                }
                System.out.println();
                return;
            }
        }
    }

    public static void main(String[] args) {
        new Test12().printToMaxOfNDigits(2);
    }
}
