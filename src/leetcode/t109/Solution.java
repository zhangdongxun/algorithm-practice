package leetcode.t109;

/**
 * Created by zhangdongxun on 2017/10/4.
 */
/**
 * Definition for singly-linked list.
 */
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; next = null; }
}
/**
 * Definition for binary tree
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
//将一个有序链表转换为一个二叉搜索树，类似于有序数组转换为二叉搜索树
//找到链表的中值节点作为二叉搜索树的根节点，之后对左右两边的子链表再进行重复操作，即递归
//对于链表来说，找中间位置，可以使用一块一慢指针的方式来解决
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        return getTree(head,null);
    }
    public TreeNode getTree(ListNode startNode,ListNode endNode){
        //结束条件
        if(startNode==endNode)
            return null;
        ListNode slow=startNode;
        ListNode fast=startNode;
        while(fast!=endNode&&fast.next!=endNode){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode treeHead=new TreeNode(slow.val);
        //左右两个子链表不可以包括中间节点
        treeHead.left=getTree(startNode,slow);
        treeHead.right=getTree(slow.next,endNode);
        return treeHead;
    }
}