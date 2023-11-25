package LeetCode_42;

import java.util.Arrays;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Integer n = (int)(Math.random()*20);
        Integer [] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*20);
        }
        // Approach 1 Trapping Water O(n)->Time Complexity O(n)->Space Complexity
        Integer [] left = new Integer[n];
        Integer [] right = new Integer[n];

        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]= Integer.max(arr[i],right[i+1]);
        }

        left[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Integer.max(arr[i],left[i-1]);
        }
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum+=Integer.min(left[i],right[i])-arr[i];
        }
        System.out.println(Arrays.asList(arr));
        System.out.println(Arrays.asList(left));
        System.out.println(Arrays.asList(right));
        System.out.println("Sum : "+sum);

    }
}
