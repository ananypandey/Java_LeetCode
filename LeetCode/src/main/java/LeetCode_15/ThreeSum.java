package LeetCode_15;

import java.util.*;

public class ThreeSum
{
    public static List<List<Integer>> threeSum(int[] nums)
    {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n-2;i++)
        {
            int j =i+1;
            int k = n-1;
            int val = nums[i];
            while (j<k)
            {
                if(val+nums[j]+nums[k]==0)
                {
                    List<Integer> list = new ArrayList<>();
                    list.add(val);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    j++;
                }
                else if(val+nums[j]+nums[k]<0)
                {
                    j++;
                }
                else if (val+nums[j]+nums[k]>0)
                {
                    k--;
                }
            }
        }
        for (List<Integer> lst : set)
        {
            ans.add(lst);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

}
