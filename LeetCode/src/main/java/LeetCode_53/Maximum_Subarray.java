package LeetCode_53;

public class Maximum_Subarray
{
    public static int maxSubArray(int[] nums)
    {
        int mxsum = nums[0];
        int sum=0;
        int n = nums.length;
        for (int i=0;i<n;i++)
        {
            if(sum<0)
            {
                sum=0;
            }
            sum+=nums[i];
            mxsum=Integer.max(sum,mxsum);
        }
        return mxsum;
    }
    public static void main(String[] args) {
        System.out.println("Inisde main");
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
