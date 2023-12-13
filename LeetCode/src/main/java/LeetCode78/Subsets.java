package LeetCode78;

import java.util.ArrayList;

public class Subsets
{
    static ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    static void Traverse(int index,int[] nums,ArrayList<Integer> arrayList)
    {
        if(index>nums.length)
        {
            return;
        }
        for (int i=index;i<nums.length;i++)
        {
            arrayList.add(nums[i]);
            arrayLists.add(new ArrayList<>(arrayList));
            Traverse(i+1,nums,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }
    static void subsets(int[] nums)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(0,nums,arrayList);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
        arrayLists.add(new ArrayList<>());
        System.out.println(arrayLists);
    }
}
