package LeetCode_394;

import java.util.Stack;

public class DecodeString {
    static void decodeString(String str) {
        Stack<Character> stack = new Stack<>();
        String fstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)) && stack.isEmpty()) {
                fstr += str.charAt(i);
                continue;
            }
            if (str.charAt(i) == ']') {
                StringBuilder nstr = new StringBuilder();
                while (stack.peek() != '[') {
                    nstr.append(stack.peek());
                    stack.pop();
                }
                StringBuilder number = new StringBuilder();
                int n = 0;
                stack.pop();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    number.append(Character.getNumericValue(stack.peek()));
                    stack.pop();
                }
                n = Integer.parseInt(number.reverse().toString());
                if (stack.isEmpty()) {
                    nstr.reverse();
                    while (n > 0) {
                        fstr += nstr;
                        n--;
                    }
                } else {
                    nstr.reverse();
                    while (n > 0) {
                        for (int j = 0; j < nstr.length(); j++) {
                            stack.push(nstr.charAt(j));
                        }
                        n--;
                    }
                }
            } else {
                stack.push(str.charAt(i));
            }
        }
        System.out.println(fstr);
    }

    public static void main(String[] args) {
        String str = "3[a2[c]]";
        decodeString(str);
    }
}
