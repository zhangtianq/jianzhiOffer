/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作。
 * 比如输入"abcdefg"和数字2，返回"cdefgab"
 */
public class Test42_1 {

    public String leftRotateString(String str, int n) {
        if (str == null || n > str.length() || n < 0) {
            return str;
        }
        String[] s = {str.substring(0, n), str.substring(n, str.length())};
        StringBuilder sb = new StringBuilder();
        for (String ss : s) {
            sb.append(reverse(ss));
        }
        return reverse(sb.toString());
    }

    private String reverse(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < (array.length + 1) / 2; i++) {
            char tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return String.valueOf(array);
    }
}
