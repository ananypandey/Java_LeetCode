package Leetcode_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2
{
    static List<List<Integer>> lists = new ArrayList<>();
    static void Traverse(int[] nums,int target,int sum,int index,ArrayList<Integer> arrayList)
    {
        if(sum==target)
        {
            if(!lists.contains(arrayList))
                lists.add(new ArrayList<>(arrayList));
            return;
        }
        if (index>=nums.length)
            return;
        if (sum>target)
            return;
        for (int i=index;i<nums.length;i++)
        {
            sum+=nums[i];
            arrayList.add(nums[i]);
            System.out.println(sum +" "+nums[i] + " "+arrayList);
            Traverse(nums,target,sum,i+1,arrayList);
            arrayList.remove(arrayList.size()-1);
            sum-=nums[i];
        }
    }
    static void combinationSum2(int[] nums,int target)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(nums,target,0,0,arrayList);
        System.out.println(lists);
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {2,5,2,1,2};
        Arrays.sort(nums);
        int target = 5;
        combinationSum2(nums,target);
    }
}
