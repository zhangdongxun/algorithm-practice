package leetcode.t242_Valid_Anagram;

/**
 * Created by zhangdongxun on 2017/10/8.
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null||t==null||s.length()!=t.length()){
            return false;
        }
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        int[] map=new int[256];
        for(int i=0;i<ch1.length;i++){
            map[ch1[i]]++;
        }
        for(int i=0;i<ch2.length;i++){
            if(map[ch2[i]]--==0)
                return false;
        }
        return true;
    }
}
