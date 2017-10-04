#1.title
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

#2.explain
分三步：
 (1)第一遍扫描：对每个结点进行复制，把复制出来的新结点插在原结点之后
 (2)第二遍扫描：根据原结点的random，给新结点的random赋值
 (3)第三遍扫描：把新结点从原链表中拆分出来
 
 ps.
 (1)leetcode地址：https://leetcode.com/problems/copy-list-with-random-pointer/description/
 (2)剑指offer第26题:复杂链表的复制