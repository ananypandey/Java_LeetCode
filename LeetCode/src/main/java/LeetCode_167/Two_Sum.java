package LeetCode_167;

public class Two_Sum {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{2,7,11,15};
        Integer target = 9;
        int i=0;
        int j = nums.length-1;
        boolean flag = false;
        while(i<j)
        {
            if(nums[i]+nums[j]==target)
            {
                flag=true;
                System.out.println("Given target is present");
                break;
            }
            if(nums[i]+nums[j]<target)
            {
                i++;
            }
            if(nums[i]+nums[j]>target)
            {
                j--;
            }
        }
        if(!flag)
        {
            System.out.println("Given target is not present");
        }
    }
}
