/**
 * @author: ztq
 * @Date: 2018/02/18
 */

import node.ListNode;

/***
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Test37 {

    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        int len1 = 0, len2 = 0;
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != null) {
            p1 = p1.next;
            len1++;
        }
        while (p2 != null) {
            p2 = p2.next;
            len2++;
        }
        int x = len1 - len2;
        if (x > 0) {
            while (x > 0) {
                pHead1 = pHead1.next;
                x--;
            }
            while (pHead1 != pHead2) {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        } else {
            while (x < 0) {
                pHead2 = pHead2.next;
                x++;
            }
            while (pHead1 != pHead2) {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return pHead1;
    }
}
