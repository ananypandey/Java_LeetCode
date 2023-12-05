package LeetCode_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber
{
    static private Map<Character,String> digitToLetters = new HashMap<>();
    static private List<String> resultList = new ArrayList<>();

    static List<String> letterCombinations(String digits)
    {
        if(digits== null || digits.length()==0)
        {
            return resultList;
        }
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        generateCombinations(digits,0,new StringBuilder());
        return resultList;
    }

    private static void generateCombinations(String digits, int currentIndex, StringBuilder currentCombination )
    {
        if(currentIndex == digits.length())
        {
            resultList.add(currentCombination.toString());
            return;
        }
        char currentDigit = digits.charAt(currentIndex);
        String letterOptions = digitToLetters.get(currentDigit);

        if(letterOptions!=null)
        {
            for(int i=0;i<letterOptions.length();i++)
            {
                currentCombination.append(letterOptions.charAt(i));
                generateCombinations(digits,currentIndex+1,currentCombination);
                currentCombination.deleteCharAt(currentCombination.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations("26"));
    }
}
