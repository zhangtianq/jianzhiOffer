/**
 * @author: ztq
 * @Date: 2018/02/09
 */

/***
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Test04 {

    //方法一
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll(" ", "%20");
    }

    //方法二
    public String replaceSpace2(StringBuffer str) {
        char[] arr = str.toString().toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char c : arr) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
