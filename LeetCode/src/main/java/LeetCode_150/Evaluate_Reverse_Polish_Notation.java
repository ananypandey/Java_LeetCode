package LeetCode_150;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation
{
    static int evalRPN(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        for(int i=0;i<n;i++)
        {
            if(tokens[i].length()>1 || Character.isDigit(tokens[i].charAt(0)))
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
            else if (!stack.isEmpty()){
                int x = stack.peek();
                stack.pop();
                int y= stack.peek();
                stack.pop();
                if(tokens[i].equals("+"))
                {
                    stack.push(x+y);
                }
                else if(tokens[i].equals("-"))
                {
                    stack.push(y-x);
                } else if (tokens[i].equals("*"))
                {
                 stack.push(x*y);
                }
                else if (tokens[i].equals("/"))
                {
                    stack.push(y/x);
                }
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
}
