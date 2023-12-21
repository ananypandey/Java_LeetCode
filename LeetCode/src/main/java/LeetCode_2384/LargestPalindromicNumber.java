package LeetCode_2384;

import java.util.Collections;

public class LargestPalindromicNumber {
    public static void main(String[] args) {
        String str = "444947137";
        int[] freq = new int[10];
        boolean isEvenPresent=false;
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - '0']++;
            if(str.charAt(i)=='0')
                continue;
            if(freq[str.charAt(i) - '0']>=2)
            {
                isEvenPresent=true;
            }
        }
        String fstr = new String();
        StringBuilder bstr = new StringBuilder();
        Integer odd = -1;
        if (freq[0] == str.length())
        {
            System.out.println(0);
        }
        else if (!isEvenPresent)
        {
            for (int i = 9; i >=0; i--)
            {
                if(freq[i]==1)
                    System.out.println((char) (i + 48));
            }
        }
        else if(isEvenPresent)
        {
            for (Integer i = 9; i >= 0; i--)
            {
                while (freq[i] > 1) {
                    fstr += i.toString();
                    bstr.append(i.toString());
                    freq[i] -= 2;
                }
                if (freq[i] == 1 && odd == -1) {
                    odd = i;
                }
            }
        }
        System.out.println(fstr + odd.toString() + bstr.reverse().toString());

    }
}
