package leetcode.t557_Reverse_Words_in_a_StringIII;

/**
 * Created by zhangdongxun on 2017/10/8.
 */
public class Solution {
    public String reverseWords(String s) {
        char[] chs = s.toCharArray();
        int left = 0;
        for (int right = 0; right <= chs.length; right++) {
            if (right == chs.length || chs[right] == ' ') {
                reverse(chs, left, right - 1);
                left = right + 1;
            }
        }
        return String.valueOf(chs);
    }

    // reverse a[] from a[i] to a[j]
    public void reverse(char[] chs, int i, int j) {
        char temp;
        while (i < j) {
            temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
            i++;
            j--;
        }
    }
}
