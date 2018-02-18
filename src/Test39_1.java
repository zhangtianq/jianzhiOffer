/**
 * @author: ztq
 * @Date: 2018/02/18
 */

import node.TreeNode;

/***
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Test39_1 {

    public boolean isBalanced_Solution(TreeNode root) {
        return isBalanced(root, new Holder());
    }

    private class Holder {
        int n;
    }

    private boolean isBalanced(TreeNode root, Holder h) {
        if (root == null) {
            h.n = 0;
            return true;
        }
        Holder left = new Holder(), right = new Holder();
        if (isBalanced(root.left, left) && isBalanced(root.right, right)) {
            int diff = left.n - right.n;
            if (diff >= -1 && diff <= 1) {
                h.n = 1 + (left.n > right.n ? left.n : right.n);
                return true;
            }
        }
        return false;
    }
}
