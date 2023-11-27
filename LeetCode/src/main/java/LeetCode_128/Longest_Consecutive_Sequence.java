package LeetCode_128;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(Integer[] nums)
    {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        int mxlen =0;
        for(int i=0;i<n;i++)
        {
            int len =0;
            if(!set.contains(nums[i]-1))
            {
                int val =nums[i];
                while(set.contains(val))
                {
                    val++;
                    len++;
                }
            }
            mxlen = Integer.max(len,mxlen);
        }
        return mxlen;
    }
    public static void main(String[] args) {
        Integer [] arr = new Integer[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
