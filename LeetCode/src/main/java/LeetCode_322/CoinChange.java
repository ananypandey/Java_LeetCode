package LeetCode_322;

import java.util.ArrayList;

public class CoinChange
{
    static int mnLen=Integer.MAX_VALUE;
    static void Traverse(int [] coins, int target,int index, int sum,ArrayList<Integer> arrayList)
    {
        if(sum==target)
        {
            mnLen = Integer.min(arrayList.size(),mnLen);
            return;
        }
        if(sum>target)
            return;
        for(int i=index;i<coins.length;i++)
        {
            if(coins[i]+sum>target)
            {
                continue;
            }
            sum+=coins[i];
            arrayList.add(coins[i]);
            Traverse(coins,target,i,sum,arrayList);
            sum-=arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
        }

    }
    static int coinChange(int[] coins,int target)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(coins,target,0,0,arrayList);
        return mnLen;
    }
    public static void main(String[] args) {
        System.out.println("Inside main");
        int[] coins = {1,2,4};
        System.out.println(coinChange(coins,11));
    }
}
