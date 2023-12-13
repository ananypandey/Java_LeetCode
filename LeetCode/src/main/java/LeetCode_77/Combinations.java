package LeetCode_77;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Combinations
{
    static List<List<Integer>> lists = new ArrayList<>();
    static void Traverse(int n, int k,int index,ArrayList<Integer> arrayList)
    {
        if(arrayList.size()==k)
        {
            lists.add(new ArrayList<>(arrayList));
            return;
        }
        for(int i=index;i<=n;i++)
        {
            arrayList.add(i);
            Traverse(n,k,i+1,arrayList);
            arrayList.remove(arrayList.size()-1);
        }
    }
    static void combine(int n,int k)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Traverse(n,k,1,arrayList);
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n =4;
        int k=2;
        combine(n,k);
        System.out.println(lists);
    }
}
