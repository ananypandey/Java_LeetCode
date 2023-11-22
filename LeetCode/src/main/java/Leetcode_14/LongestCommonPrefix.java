package Leetcode_14;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","floght"};
        int mnl=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            mnl = Integer.min(mnl,strs[i].length());
        }
        String ans = new String();
        boolean flag = true;
        for(int i=0;i<mnl;i++)
        {
            char ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(ch!=strs[j].charAt(i))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                ans+=ch;
            }
            else
            {
                break;
            }
        }
        System.out.println(ans);
    }
}
