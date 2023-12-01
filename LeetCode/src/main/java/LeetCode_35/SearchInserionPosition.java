package LeetCode_35;

public class SearchInserionPosition
{
    static int searchIndex(int[] nums, int target)
    {
        int i =0;
        int j= nums.length-1;
        int mid = i+(j-i)/2;
        while (i<=j)
        {
            //System.out.println(mid);
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                i=mid+1;
            }
            else if(nums[mid]>target)
            {
                j=mid-1;
            }
            mid=i+(j-i)/2;
        }
        return mid;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,3,5,6,7,8,9};
        int target = 8;
        System.out.println(searchIndex(nums,target));
    }
}
