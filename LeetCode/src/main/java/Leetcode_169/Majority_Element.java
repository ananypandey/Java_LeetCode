package Leetcode_169;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int) (Math.random()*100);
        int [] arr = new int[n];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]= (int)(Math.random()*2);
            System.out.print(arr[i]+ " ");
        }
        for(int i =0;i<n;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],1);
            }
            else
            {
                int value = mp.get(arr[i]);
                mp.put(arr[i],++value);
            }
        }
        System.out.println("Printing Value wrt key in map");
        for (int i : mp.keySet())
        {
            if(mp.get(i)>(arr.length/2))
            {
                System.out.println(i);
            }
        }
    }
}
