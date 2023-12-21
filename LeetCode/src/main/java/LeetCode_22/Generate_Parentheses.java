package LeetCode_22;

import java.util.*;

public class Generate_Parentheses
{
    static HashSet<String> list = new HashSet<>();
    static List<String> lists = new ArrayList<>();
    static boolean shouldPut(StringBuilder stringBuilder)
    {
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<stringBuilder.length();i++)
        {
          if(stringBuilder.charAt(i)==')' && stack.isEmpty())
              return false;
          else if(stringBuilder.charAt(i)=='(')
              stack.push('(');
          else if (stringBuilder.charAt(i)==')' && stack.peek()=='(')
              stack.pop();
          else
              return false;
        }
        return stack.isEmpty();
    }
    static void Traverse(int index,StringBuilder stringBuilder)
    {
        if(index==stringBuilder.length())
        {
            if(shouldPut(stringBuilder))
                list.add(stringBuilder.toString());
        }

        for(int i=index;i<stringBuilder.length();i++)
        {
            char ch = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i,stringBuilder.charAt(index));
            stringBuilder.setCharAt(index,ch);
            System.out.println(stringBuilder);
            Traverse(index+1,stringBuilder);
            ch = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i,stringBuilder.charAt(index));
            stringBuilder.setCharAt(index,ch);

        }
    }
    static void generateParenthesis(int n)
    {
        StringBuilder stringBuilder = new StringBuilder("()");
        StringBuilder ogStringBuilder = new StringBuilder();
        n--;
        while (n>=0)
        {
            ogStringBuilder.append(stringBuilder);
            n--;
        }
        Traverse(0,ogStringBuilder);
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = 4;
        generateParenthesis(n);

        list.stream().forEach(i->lists.add(i));
        System.out.println(lists);;

    }
}
//["(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()"]