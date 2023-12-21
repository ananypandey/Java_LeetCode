package LeetCode_31;

public class Next_Permutation
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {1,1,5,9};
        int i=nums.length-1;
        while (nums[i]==9)
        {
            nums[i]=0;
           i--;
        }
        nums[i]=nums[i]+1;
        for (int j=0;j<nums.length;j++)
        {
            System.out.println(nums[j]);
        }
    }
}
