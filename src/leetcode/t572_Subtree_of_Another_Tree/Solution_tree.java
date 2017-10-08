package leetcode.t572_Subtree_of_Another_Tree;

/**
 * Created by zhangdongxun on 2017/10/6.
 */
/**
 * Definition for a binary tree node.
 * */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution_tree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //s为空树，或者当s等于NULL时还没找到相等的一个节点，返回false
        if(s==null)
            return false;
        //找到一个相等节点，如果这个节点以下全都于t相等，返回true
        if(isSame(s,t))
            return true;
        //否则继续往下寻找是否有相等节点，左右子树任意一个找到即可
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean isSame(TreeNode root1,TreeNode root2){
        //两个数同时到达底端，说明完全相等
        if(root1==null&&root2==null)
            return true;
        //当其中有个已到达底端但另一个还没有，返回false
        if(root1==null||root2==null)
            return false;
        //当前val不等，返回false
        if(root1.val!=root2.val)
            return false;
        //递归判断左右子树
        return isSame(root1.left,root2.left)&&isSame(root1.right,root2.right);
    }
}
