package leetcode.t572_Subtree_of_Another_Tree;

/**
 * Created by zhangdongxun on 2017/10/8.
 */
class Solution_kmp {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String s1=serialize(s);
        String s2=serialize(t);
        return kmpMatch(s1,s2)!=-1;
    }
    //二叉树序列化（前序）
    public String serialize(TreeNode root){
        if(root==null){
            return "!#";
        }
        String res="!"+root.val;
        res+=serialize(root.left);
        res+=serialize(root.right);
        return res;
    }
    //kmp
    public int kmpMatch(String ss,String ps){
        if(ss==null||ps==null||ps.length()<1||ss.length()<ps.length()){
            return -1;
        }
        char[] s=ss.toCharArray();
        char[] p=ps.toCharArray();
        int[] next=getNext(ps);
        int i=0;
        int j=0;
        while(i<s.length&&j<p.length){
            if(j==-1||s[i]==p[j]){
                i++;
                j++;
            }else{
                j=next[j];
            }
        }
        return j==p.length?i-j:-1;
    }
    public int[] getNext(String ps){
        char[] p=ps.toCharArray();
        int[] next=new int[p.length];
        next[0]=-1;
        int k=-1;
        int j=0;
        while(j<p.length-1){
            if(k==-1||p[j]==p[k]){
                if(p[++j]==p[++k]){
                    next[j]=next[k];
                }else{
                    next[j]=k;
                }
            }else{
                k=next[k];
            }
        }
        return next;
    }
}
