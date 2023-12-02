package LeetCode215;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Largest_Element_In_an_Arrayy
{
    public static int findKthLargest(int [] nums,int k)
    {
        Arrays.sort(nums);
        return nums[nums.length-k];

    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k =2;
        System.out.println(findKthLargest(nums, k));
    }
}
