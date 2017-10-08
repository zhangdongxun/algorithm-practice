##1.题目[LeetCode242](https://leetcode.com/problems/valid-anagram/description/)

Given two strings s and t, write a function to determine if t is an anagram of s.

For example,

s = "anagram", t = "nagaram", return true.

s = "rat", t = "car", return false.

Note:

You may assume the string contains only lowercase alphabets.

Follow up:

What if the inputs contain unicode characters? How would you adapt your solution to such case?
 
 题目大意:
 
    给定两个字符串s和t，写一个函数来确定t是不是s的一个变位词。
    
    比如说：s="anagram", t="nagaram", 是
    
    s="rat", t="car", 不是
    
    注意：你可以假定字符串只含有小写字母。
    
    进一步的：如果输入含有unicode字符呢？这样的情况怎么去适用你的解决方案呢？    
 ##2.思路
 
               使用哈希表做字符计数
  
          str1                   str2
           |对str1做               |对str1做 
           |字符计数                |字符计数
          \|/                     \|/
         哈希表1                 哈希表2
              \                  /
               \                /
               _\|            |/_
           比较哈希表1与哈希表2的记录是否一致
                        
    可以用固定长度的数组代替哈希表结构，时间复杂度为O(N)，空间复杂度为O(N)。
 
 