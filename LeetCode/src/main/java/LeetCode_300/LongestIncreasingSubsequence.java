package LeetCode_300;

import java.util.ArrayList;

public class LongestIncreasingSubsequence {
    static int mxLen = Integer.MIN_VALUE;
    static void Traverse(int[] nums, int index, ArrayList<Integer> arrayList)
    {
        if(index==nums.length)
        {
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(arrayList.size()==0)
            {
                arrayList.add(nums[i]);
            } else if (nums[i]<=arrayList.get(arrayList.size()-1)) {
                continue;
            } else if(nums[i]>arrayList.get(arrayList.size()-1))
            {
                arrayList.add(nums[i]);
            }
            mxLen = Integer.max(arrayList.size(),mxLen);
            Traverse(nums,i+1,arrayList);
            if(arrayList.get(arrayList.size()-1)==nums[i])
            {
                arrayList.remove(arrayList.size()-1);
            }
        }
    }
    static int lengthOfLIS(int[] nums)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(nums,0,arrayList);
        return mxLen;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(nums));
    }
}
