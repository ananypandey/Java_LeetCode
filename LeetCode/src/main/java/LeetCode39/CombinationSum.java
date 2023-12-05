package LeetCode39;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum
{
    static List<List<Integer>> ans = new ArrayList<>();
    static void generateCombinationSum(int currIndex,int sum,int target,List<Integer> result,Integer[] candidates)
    {
        if(sum>target)
        {
            return;
        }
        if(sum==target)
        {
            ans.add(new ArrayList<>(result));
            return;
        }
        for(int i=currIndex;i<candidates.length;i++)
        {
            sum+=candidates[i];
            result.add(candidates[i]);
            generateCombinationSum(i,sum,target,result,candidates);
            sum-=candidates[i];
            result.remove(result.size()-1);
        }
    }
    static List<List<Integer>> combinationSum(Integer[] candidates, int target)
    {
        List<Integer> result = new ArrayList<>();
        generateCombinationSum(0,0,target,result,candidates);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Integer[] candidate = {2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidate,target));
    }
}
