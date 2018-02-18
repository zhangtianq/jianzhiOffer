/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import node.ListNode;

/***
 * 给定单向链表的头指针和一个结点指针，定义一个函数在O(1)时间删除该节点
 */
public class Test13 {

    public void deleteNode(ListNode head, ListNode deListNode) {
        if (head == null || deListNode == null) {
            return;
        }
        //删除的是头结点
        if (deListNode == head) {
            head = null;
        } else {
            //删除的是尾结点
            if (deListNode.next == null) {
                ListNode pointNode = head;
                while (pointNode.next.next != null) {
                    pointNode = pointNode.next;
                }
                pointNode.next = null;
            } else {
                deListNode.val = deListNode.next.val;
                deListNode.next = deListNode.next.next;
            }
        }
    }
}
