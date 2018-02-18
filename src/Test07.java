/**
 * @author: ztq
 * @Date: 2018/02/13
 */

import java.util.Stack;

/***
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。队列中的元素为int类型。
 */
public class Test07 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("error");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}

/***
 * 用两个队列来实现一个栈，完成栈的Push和Pop操作。栈中的元素为int类型。
 */
/*
public class Test05 {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int node) {
        queue1.add(node);
    }

    public int pop() {
        if (getSize() != 0) {
            if (!queue1.isEmpty()) {
                putToAnother();
                return queue1.remove();
            } else {
                putToAnother();
                return queue2.remove();
            }
        } else {
            throw new RuntimeException("error");
        }
    }

    private void putToAnother() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.remove());
            }
        } else if (!queue2.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.remove());
            }
        }
    }

    private int getSize() {
        return queue1.size() + queue2.size();
    }

}
*/
