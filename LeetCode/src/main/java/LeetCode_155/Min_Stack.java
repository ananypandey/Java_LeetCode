package LeetCode_155;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> stack2;

    public MinStack() {
    stack = new Stack<>();
    stack2= new Stack<>();
    }

    public void push(int val) {
    stack.push(val);
    if(stack2.isEmpty())stack2.push(val);
    else {
        if (val<=stack2.peek())stack2.push(val);
    }
    }

    public void pop() {
        int i = stack.peek();
        int j = stack2.peek();
        if(i==j)
        {
            stack.pop();
            stack2.pop();
        }
        else stack.pop();
    }

    public int top() {
    return stack.peek();
    }

    public int getMin() {
    return stack2.peek();
    }
}

public class Min_Stack
{
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(1);
        obj.push(3);
        obj.push(5);
        System.out.println(obj.top());
        System.out.println("Inside Main");
    }
}
