package LeetCode_162;

public class Find_Peak_Element
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {1,2,3,4,3};
        int n = nums.length;
        if(nums[0]>nums[1])
            System.out.println(0);
        if(nums[n-1]>nums[n-2])
            System.out.println(n-1);
        int low =1;
        int high=n-1;
        while (low<=high)
        {
            int mid = (high+low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
                System.out.println(nums[mid]);
                break;
            }
            else if(nums[mid]>nums[mid-1])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
    }
}
