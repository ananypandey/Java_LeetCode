package LeetCode_3;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter
{
    public static int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> hashSet = new HashSet<>() ;
        int mxLen=0;
        int left=0;
        int right=0;
        int n = s.length();
        while (right<n)
        {
            if (!hashSet.contains(s.charAt(right)))
            {
                hashSet.add(s.charAt(right));
                mxLen=Integer.max(mxLen,right-left+1);
            }
            else
            {
                while (s.charAt(left)!=s.charAt(right))
                {
                    hashSet.remove(s.charAt(left));
                    left++;
                }
                hashSet.remove(s.charAt(left));
                left++;
                hashSet.add(s.charAt(right));
            }
            right++;
        }
        return mxLen;
    }
    public static void main(String[] args) {

        String str = "bbbbb";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
