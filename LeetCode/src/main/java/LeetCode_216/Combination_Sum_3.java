package LeetCode_216;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_3
{
    static List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) {
        int k = 9;
        int n = 45;
        combinationSum3( k, n);
    }

    static void  Traverse(int k,int n,int index,int sum,ArrayList<Integer> arrayList)
    {
        if(sum>n)
            return;
        if(sum==n)
        {
            if(arrayList.size()==k)
                lists.add(new ArrayList<>(arrayList));
            return;
        }
        for (int i=index;i<=9;i++)
        {
            sum+=i;
            System.out.println(i);
            arrayList.add(i);
            Traverse(k,n,i+1,sum,arrayList);
            sum-=i;
            arrayList.remove(arrayList.size()-1);
        }
    }
    private static void combinationSum3(int k, int n)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(k,n,1,0,arrayList);
        System.out.println(lists);
    }
}
