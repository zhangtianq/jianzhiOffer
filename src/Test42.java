/**
 * @author: ztq
 * @Date: 2018/02/18
 */

/***
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student."，则输出""
 */
public class Test42 {

    public String reverseSentence(String str) {
        if (str == null || "".equals(str.trim())) {
            return str;
        }
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = s.length - 1; i > 0; i--) {
            sb.append(s[i] + " ");
        }
        return sb.append(s[i]).toString();
    }

}
