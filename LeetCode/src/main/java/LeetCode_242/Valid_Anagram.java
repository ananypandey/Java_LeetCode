package LeetCode_242;

public class Valid_Anagram
{
    public static boolean isAnagram(String s, String t)
    {
        int[] freq = new int[27];
        int slen =s.length();
        int tlen = t.length();
        if(slen!=tlen)
        {
            return false;
        }
        for(int i=0;i<slen;i++)
        {
            freq[s.charAt(i)-96]++;

        }
        for(int j=0;j<tlen;j++)
        {
            if(freq[t.charAt(j)-96]==0)
            {
                return false;
            }
            freq[t.charAt(j)-96]--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
}
