package LeetCode_49;

import java.util.*;

public class Group_Anagrams {
    public static List<List<String>> isAnagram(String[] strs)
    {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String word: strs)
        {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = String.valueOf(charArray);
            if (!map.containsKey(sortedWord))
            {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        result.addAll(map.values());
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(isAnagram(strs));
    }
}
