package Leetcode_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove_Duplicate_From_Sorted_Array_2
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*100);
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= (int)(Math.random()*10);
        }

                Arrays.sort(arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(j==0 || j==1 || arr[i]!=arr[j-2])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        System.out.println("After Performing Remove Operation");
        for (int i=0;i<j;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
