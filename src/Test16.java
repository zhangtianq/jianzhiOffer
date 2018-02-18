/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import node.ListNode;

/***
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Test16 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null, next = null;
        while (head != null) {
            //保存后一个结点，防止链表断裂
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
