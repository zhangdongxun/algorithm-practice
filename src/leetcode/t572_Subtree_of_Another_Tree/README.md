##1.题目[LeetCode572](https://leetcode.com/problems/subtree-of-another-tree/description/)
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 
 Example 1:
 
 Given tree s:
 
        3
       / \
      4   5
     / \
    1   2
 Given tree t:
 
      4 
     / \
    1   2
 Return true, because t has the same structure and node values with a subtree of s.
 
 Example 2:
 
 Given tree s:
 
        3
       / \
      4   5
     / \
    1   2
       /
      0
 Given tree t:
   
      4
     / \
    1   2
 Return false.
 
 题目大意:
 
    给定两个树s和t，判断t是否是s的一个子树。这里s的子树是指，一个树由s中的一个节点及其所有子节点组成，s也可以是自己本身的一个子树。
    
 ##2.思路
 ###（1）解法一
 
 普通解法：（树）二叉树遍历+匹配问题，递归求解。考察s中以每个节点为头的子树是否与t一致。
 
 普通解法的时间复杂度为O(N*M)，N代表s节点数，M代表t节点数。
 
 ###（2）解法二
 
 最优解法：（字符串）二叉树序列化+KMP算法。
 
 时间复杂度为O(M+N)。
 
     二叉树s                        二叉树s
       |                             |
       |序列化                        |序列化
      \|/                           \|/
     字符串str1                     字符串str2
            \                       /
             \                     /
             _\|                 |/_
           用KMP算法判断str1中是否含有str2
                        |
                        |
                       \|/
         如果str1中含有str2，说明s中某棵子树与t一致，
         否则，说明s中没有任何子树与t一致。
 
 
 ps,[kmp算法详解](http://www.cnblogs.com/zhangboy/p/7635627.html)