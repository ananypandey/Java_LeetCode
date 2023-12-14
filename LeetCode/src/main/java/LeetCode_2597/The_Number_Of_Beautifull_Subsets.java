package LeetCode_2597;

import java.util.ArrayList;
import java.util.HashSet;

public class The_Number_Of_Beautifull_Subsets
{
    static ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
    static void  Traverse(int[] nums,int index,int k, ArrayList<Integer> arrayList)
    {
        if(index>=nums.length)
        {
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(arrayList.size()==0)
            {
               arrayList.add(nums[i]);
               arrayLists.add(new ArrayList<>(arrayList));
            } else if (isStrictlyIncreasig(arrayList,nums[i],k)) {
                arrayList.add(nums[i]);
                arrayLists.add(new ArrayList<>(arrayList));
            }
            Traverse(nums,i+1,k,arrayList);
            if(nums[i]==arrayList.get(arrayList.size()-1))
            {
                arrayList.remove(arrayList.size()-1);
            }
        }
    }

    private static boolean isStrictlyIncreasig(ArrayList<Integer> arrayList,int num,int k)
    {

        for (int i=0;i<arrayList.size();i++)
        {
            if (Math.abs(arrayList.get(i)-num)==k)
                return false;
        }
        return true;
    }

    static void beautifullSubsets(int[] nums, int k)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(nums,0,k,arrayList);
    }
    public static void main(String[] args) {
        System.out.println("Entering Main");
        int k =3;
        int[] nums = {1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000};
        beautifullSubsets(nums,k);
        System.out.println(arrayLists);
        System.out.println(arrayLists.size());
    }
}
