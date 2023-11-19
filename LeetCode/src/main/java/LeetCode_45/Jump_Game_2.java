package LeetCode_45;

import java.util.Arrays;

public class Jump_Game_2
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*15);
        Integer [] arr = new Integer[n];
        System.out.println("n : "+n);
        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*5);
        }
        System.out.println("Printing Array : "+ Arrays.asList(arr));
        int farthest =0;
        int end =0;
        int jump=0;
        for(int i=0;i<n-1;i++)
        {
            farthest = Math.max(farthest,i+arr[i]);
            if(farthest>n-1)
            {
                jump++;
                break;
            }
            if(i==end)
            {
                end = farthest;
                jump++;
            }
        }
        System.out.println(jump);

    }
}
