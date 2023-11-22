package LeetCode_151;

import java.util.Stack;

public class Reverse_Words_In_a_String
{
    public static void main(String[] args)
    {
       String str = new String("  Anay  is    king   ");
       String nstr = "";
       str=str.trim();
       int i = str.length()-1;
       while (i>=0)
       {
            if(str.charAt(i)==' ')
            {
                i--;
                continue;
            }
            int j=i;
            while (j>=0 && str.charAt(j)!=' ')
            {
                j--;
            }
            nstr+=str.substring(j+1,i+1)+' ';
            i=j;
       }
        System.out.println(nstr.trim());
    }
}
