package BacktrackingPractice;

import java.util.ArrayList;

public class Practice_1
{
    static void Traverse(int[] nums,ArrayList<Integer> arrayList, int index)
    {
       if(index>=nums.length)
           return;
       for(int i=index;i<nums.length;i++)
       {
           arrayList.add(nums[i]);
           System.out.println(i + " "+index);
           System.out.println(arrayList);
           Traverse(nums,arrayList,i+1);
           arrayList.remove(arrayList.size()-1);

       }
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] nums ={1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(nums,arrayList,0);
    }
}
