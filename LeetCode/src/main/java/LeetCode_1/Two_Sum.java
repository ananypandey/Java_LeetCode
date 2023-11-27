package LeetCode_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Two_Sum
{
    public static int[] isTwoSum(Integer[] arr,int target)
    {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(hashMap.containsKey(target-arr[i]))
            {
                return new int[]{hashMap.get(target-arr[i]),i};
            }
            hashMap.put(arr[i],i);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*20);
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*20);
        }
        int target = (int)(Math.random()*30);
        System.out.println(isTwoSum(arr,target)[0] + " " +isTwoSum(arr,target)[1]);
    }
}
