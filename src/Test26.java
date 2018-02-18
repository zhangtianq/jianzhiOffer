/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import node.RandomListNode;

/***
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Test26 {

    public RandomListNode clone(RandomListNode pHead) {
        cloneNodes(pHead);
        connectRandomNodes(pHead);
        return reconnectNodes(pHead);
    }

    //根据原始链表的每个结点N，创建对应的N'，把N'链接在N的后面
    private void cloneNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode != null) {
            RandomListNode pClone = new RandomListNode(pNode.label);
            pClone.next = pNode.next;
            pClone.random = null;
            pNode.next = pClone;
            pNode = pClone.next;
        }
    }

    //如果原始链表上的结点N的random指向S，则它对应的复制结点N'的random指向S的下一个结点S'
    private void connectRandomNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode != null) {
            RandomListNode pClone = pNode.next;
            if (pNode.random != null) {
                pClone.random = pNode.random.next;
            }
            pNode = pClone.next;
        }
    }

    //将上一步的长链表拆分成两个链表
    private RandomListNode reconnectNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        RandomListNode pCloneNode = null;
        RandomListNode pCloneHead = null;
        if (pNode != null) {
            pCloneHead = pCloneNode = pNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        while (pNode != null) {
            pCloneNode.next = pNode.next;
            pCloneNode = pCloneNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        return pCloneHead;
    }
}
