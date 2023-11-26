package LeetCode_205;

import java.util.HashMap;

public class Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t)
    {
        HashMap<Character,Character> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hashMap.containsKey(s.charAt(i)))
            {
                if(hashMap.get(s.charAt(i))!=t.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                if(hashMap.containsValue(t.charAt(i)))
                {
                    return false;
                }
                hashMap.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
