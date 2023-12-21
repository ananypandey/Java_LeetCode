package LeetCode1081;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class SmallestSubsequenceOfDistinct {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            count[c - 'a']--;
            if(visited[c - 'a']){
                continue;
            }
            while(!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0){
                //make the current character available for next operations
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse().toString());
    }
}
