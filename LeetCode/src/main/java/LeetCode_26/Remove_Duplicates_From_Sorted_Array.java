package LeetCode_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int n = (int)(Math.random()*50);
        List<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {

            list.add((int)(Math.random()*20));
        }
        Collections.sort(list);
        int j =1;
        for(int i=1;i<n;i++)
        {
            if(list.get(i)!=list.get(i-1))
            {
                list.set(j,list.get(i));
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
