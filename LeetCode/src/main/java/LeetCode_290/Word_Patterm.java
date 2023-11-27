package LeetCode_290;

import java.util.HashMap;

public class Word_Patterm {
    public static boolean isWordPattern(String pattern,String s)
    {
        HashMap<Character,String> hashMap = new HashMap<>();
        String nstr="";
        int j=0;
        s+=" ";
        int i=0;
        for(;i<s.length();i++)
        {
            if(s.charAt(i)==' ' || i==s.length()-1)
            {
                System.out.println(nstr+ " "+pattern.charAt(j));
                if(hashMap.containsKey(pattern.charAt(j)))
                {
                    if(!hashMap.get(pattern.charAt(j)).equals(nstr))
                    {
                        System.out.println("Hi");
                        return false;
                    }
                }
                else
                {
                    if(hashMap.containsValue(nstr))
                    {
                        return false;
                    }
                    hashMap.put(pattern.charAt(j),nstr);
                }
                j++;
                nstr="";
                continue;
            }
            nstr+=s.charAt(i);
        }
        if(j<pattern.length())
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern="abba";
        String s = "dog cat cat dog";
        System.out.println(isWordPattern(pattern,s));
    }
}
