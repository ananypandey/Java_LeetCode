package LeetCode918;

public class Maximum_Sum_Circular_Subarray
{
    public static int maxSubarraySumCircular(int[] nums)
    {
        int minSum = Integer.MAX_VALUE;
        int currMinSum =0;
        int maxSum = Integer.MIN_VALUE;
        int currMaxSum =0;
        int totalSum =0;
        for(int i=0;i<nums.length;i++)
        {
            currMinSum+=nums[i];
            currMaxSum+=nums[i];

            minSum=Math.min(minSum,currMinSum);
            if(currMinSum>0)
            {
                currMinSum=0;
            }
            maxSum = Math.max(currMaxSum,maxSum);
            if(currMaxSum<0)
            {
                currMaxSum=0;
            }
            totalSum+=nums[i];
        }
        if(totalSum==minSum)
        {
            return maxSum;
        }
        else
        {
            return Math.max(maxSum,totalSum-minSum);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));
    }
}
