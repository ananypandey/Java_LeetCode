package LeetCode_58;

public class LengthOfLastWord
{
    public static void main(String[] args) {
        String str = new String("      fly me   to   the moon  ");
        System.out.println(str);
        String nstr = str.trim();
        int i = nstr.length()-1;
        int count=0;
        while (nstr.charAt(i)!=' ')
        {
            count++;
            i--;
        }
        System.out.println(count);
    }
}
