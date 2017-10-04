package leetcode.t138;

/**
 * Created by zhangdongxun on 2017/10/4.
 */
/**
 * Definition for singly-linked list with a random pointer.
 * */
class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
 }

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)
            return null;
        //第一遍扫描：对每个结点进行复制，把复制出来的新结点插在原结点之后
        RandomListNode node=head;
        while(node!=null){
            RandomListNode cloneNode=new RandomListNode(node.label);
            cloneNode.next=node.next;
            node.next=cloneNode;
            node=cloneNode.next;
        }
        //第二遍扫描：根据原结点的random，给新结点的random赋值
        node=head;
        while(node!=null){
            RandomListNode cloneNode=node.next;
            if(node.random!=null)
                cloneNode.random=node.random.next;
            node=cloneNode.next;
        }
        //第三遍扫描：把新结点从原链表中拆分出来
        RandomListNode newHead=head.next;
        node=head;
        while(node!=null){
            RandomListNode cloneNode=node.next;
            node.next=cloneNode.next;
            if(cloneNode.next!=null)
                cloneNode.next=cloneNode.next.next;
            node=node.next;
        }
        return newHead;
    }
}
