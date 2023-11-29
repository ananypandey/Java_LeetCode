package LeetCode_209;

public class Minimize_Subarray_Sum
{
    public static int minSubArrayLen(int target,int[] nums)
    {
        int n=nums.length;
        int mnlen=n+1;
        int sum =0;
        int i=0;
        int j=0;
        while (i<n)
        {
            System.out.println(sum);
            sum+=nums[i];
            i++;
            while (sum>target)
            {
                sum=sum-nums[j];
                j++;
            }
            if(sum==target)
            {
                mnlen = Integer.min(i-j,mnlen);
            }
        }
        return (mnlen==n+1)?0:mnlen;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,arr));
    }
}
