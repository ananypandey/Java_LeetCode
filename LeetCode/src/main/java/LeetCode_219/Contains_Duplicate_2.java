package LeetCode_219;

import java.util.HashMap;

public class Contains_Duplicate_2
{
    public static boolean containsNearbyDuplicate(int[] nums, int k)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hashMap.containsKey(nums[i]))
            {
                hashMap.put(nums[i],i);
            }
            else if(hashMap.containsKey(nums[i]))
            {

                int val = hashMap.get(nums[i])+1;
                System.out.println(i-val);
                if(i-val>k)
                {
                    return false;
                }
                hashMap.put(nums[i],i);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
