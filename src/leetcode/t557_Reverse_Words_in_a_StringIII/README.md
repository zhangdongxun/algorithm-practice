##1.题目[LeetCode557](https://leetcode.com/problems/reverse-words-in-a-string-iii/description/)

Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"

Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.

题目大意:

    给定一个字符串，需要反转一个句子中每个单词中的字符顺序，同时仍保留空格和初始单词顺序。
    
    注意：在字符串中，每个单词都以单个空格分隔，字符串中不会有任何额外的空格。

 ##2.思路
 
 分两步：

    （1）英文句子分割成一个个单词，left记录每一个单词的第一个字符的位置，right记录空格位置，[left ~ right-1]即为一个单词
    （2）定义reverse方法，将每个单词反转 