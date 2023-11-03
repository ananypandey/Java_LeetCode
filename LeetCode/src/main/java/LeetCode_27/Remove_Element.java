package LeetCode_27;

import java.util.ArrayList;
import java.util.List;

public class Remove_Element
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*50);
        List<Integer> list = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            list.add((int)(Math.random()*50));
        }
        int count=0;
        int val = (int)(Math.random()*100);
        for(int i : list)
        {
            if(i==val)
            {
                count++;
            }
        }
        System.out.println(list.size()-count);
    }
}
