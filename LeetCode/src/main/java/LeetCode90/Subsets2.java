package LeetCode90;

import java.util.*;

public class Subsets2 {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums = {4,1,0};
        Arrays.sort(nums);
        subsetsWithDup(nums);
    }

    static List<List<Integer>> arrayLists= new ArrayList<>();
    static void Traverse(int[] nums,int index,ArrayList<Integer> arrayList)
    {
        if(index>=nums.length)
            return;
        for(int i=index;i<nums.length;i++)
        {
            arrayList.add(nums[i]);
            Collections.sort(arrayList);
            if(!arrayLists.contains(arrayList))
                arrayLists.add(new ArrayList<>(arrayList));
            Traverse(nums,i+1,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }
    private static void subsetsWithDup(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayLists.add(new ArrayList<>());
        Traverse(nums,0,arrayList);
        System.out.println(arrayLists);
    }
}
