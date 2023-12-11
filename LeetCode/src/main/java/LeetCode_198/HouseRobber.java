package LeetCode_198;

import java.util.ArrayList;

public class HouseRobber
{
    static int rob(int[] nums)
    {
        int mxSum = Integer.MIN_VALUE;
        int n = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(0);
        arrayList.add(0);
        for(int i=3;i<n+3;i++)
        {
            arrayList.add(Math.max(arrayList.get(i-2),arrayList.get(i-3))+nums[i-3]);
        }
        System.out.println(arrayList);
        return Integer.max(arrayList.get(arrayList.size()-1),arrayList.get(arrayList.size()-2));
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
