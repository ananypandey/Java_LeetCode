package LeetCode_46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations
{
    static List<List<Integer>> lists = new ArrayList<>();
    static void Traverse(int index,int[] nums)
    {
        if(index==nums.length)
        {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Arrays.stream(nums).forEach(i->arrayList.add(i));
            lists.add(arrayList);
        }
        for(int i=index;i<nums.length;i++)
        {
            int t=nums[index];
            nums[index]=nums[i];
            nums[i]=t;
            Traverse(index+1,nums);
            t=nums[index];
            nums[index]=nums[i];
            nums[i]=t;
        }
    }
    static void permute(int[] nums)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(0,nums);
    }
    public static void main(String[] args) {
        System.out.println("Inside Permutations :");
        int[] nums = {1,2,3};
        permute(nums);
        System.out.println(lists);
    }
}
