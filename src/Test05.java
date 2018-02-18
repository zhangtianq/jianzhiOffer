/**
 * @author: ztq
 * @Date: 2018/02/09
 */


import node.ListNode;

import java.util.ArrayList;

public class Test05 {

    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
