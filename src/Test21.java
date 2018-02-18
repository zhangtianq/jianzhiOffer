/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数
 * 调用min push pop的时间复杂度都是O(1)
 */
public class Test21 {

    private Stack<Integer> minStack = new Stack<>();

    private Stack<Integer> dataStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.size() == 0 || node < minStack.peek()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public Integer pop() {
        if (dataStack.size() == 0 || minStack.size() == 0) {
            return null;
        }
        minStack.pop();
        return dataStack.pop();
    }


    public Integer min() {
        if (minStack.size() == 0) {
            return null;
        }
        return minStack.peek();
    }
}
