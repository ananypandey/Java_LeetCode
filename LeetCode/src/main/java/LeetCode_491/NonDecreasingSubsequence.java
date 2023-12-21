package LeetCode_491;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDecreasingSubsequence
{
    static List<List<Integer>> lists = new ArrayList<>();
    static void Traverse(int[] nums, int index,ArrayList<Integer> arrayList)
    {
        if(index>=nums.length)
            return;
        for(int i=index;i<nums.length;i++)
        {
            if(arrayList.size()==0)
                arrayList.add(nums[i]);
            else if(nums[i]>=arrayList.get(arrayList.size()-1))
                arrayList.add(nums[i]);
            if(!lists.contains(arrayList) && arrayList.size()>=2)
                lists.add(new ArrayList<>(arrayList));
            Traverse(nums,i+1,arrayList);
            if(nums[i]==arrayList.get(arrayList.size()-1))
                arrayList.remove(arrayList.size()-1);
        }
    }
    static void findSubsequences(int[] nums)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(nums,0,arrayList);
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {4,6,7,2,1};
        findSubsequences(nums);
        System.out.println(lists);
    }
}
