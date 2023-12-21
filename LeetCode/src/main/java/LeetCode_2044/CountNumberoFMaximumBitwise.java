package LeetCode_2044;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CountNumberoFMaximumBitwise
{

    static ArrayList<Integer> sortedList = new ArrayList<>();

    static void Traverse(int[] nums,ArrayList<Integer> arrayList,int index)
    {
        if (index==nums.length) {
            System.out.println(arrayList);
            int or = 0;
            for (int i=0;i<arrayList.size();i++)
            {
                or=or|arrayList.get(i);
            }
            sortedList.add(or);
            return;
        }
        for (int i=index;i<nums.length;i++)
        {
            arrayList.add(nums[i]);
            Traverse(nums,arrayList,i+1);
            arrayList.remove(arrayList.size()-1);
        }
        return;
    }
    static void countMaxOrSubsets(int[] nums)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(nums,arrayList,0);
    }
    public static void main(String[] args) {
        int[] nums = {3,1};
        countMaxOrSubsets(nums);
//        System.out.println(sortedList);
//        int mx = Integer.MIN_VALUE;
//        mx = sortedList.stream().max(Integer::compare).get();
//        int temp =mx;
//        ArrayList<Integer> mxList= new ArrayList<>(sortedList.stream().filter(i->i==temp).collect(Collectors.toList()));
//        System.out.println(mxList.size());
    }
}
