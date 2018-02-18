/**
 * @author: ztq
 * @Date: 2018/02/17
 */

import node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/***
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Test23 {

    //与层次遍历二叉树类似
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        queue.offer(root);
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node != null) {
                list.add(node.val);
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return list;
    }
}
