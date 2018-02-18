/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import node.ListNode;

/***
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Test15 {

    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode pre = head, last = head;
        for (int i = 0; i < k - 1; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else {
                return null;
            }
        }
        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}
