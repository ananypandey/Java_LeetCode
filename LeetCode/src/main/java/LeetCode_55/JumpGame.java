package LeetCode_55;

import java.util.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int n = (int)(Math.random()*100);
        Integer [] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*10);
        }
        boolean isReachable = true;
        int reachable =0;
        for(int i=0;i<n;i++)
        {
            if(i>reachable)
            {
                isReachable = false;
                break;
            }
            reachable = Math.max(reachable,i+arr[i]);
        }
        if (isReachable)
        {
            System.out.println("Yes Can Be Reached");
        }
        else
        {
            System.out.println("Can't be reached");
        }
    }
}
