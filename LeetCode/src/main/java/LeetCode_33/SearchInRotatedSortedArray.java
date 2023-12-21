package LeetCode_33;

public class SearchInRotatedSortedArray
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int low =0;
        int high = nums.length-1;
        boolean isPresent = false;
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
            {
                System.out.println("Target Found");
                isPresent=true;
                break;
            }
            else if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else
            {
                if(nums[mid]<target && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        if (!isPresent)
            System.out.println("Given target isn't present");
    }
}
