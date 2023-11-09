package Leetcode_189;

import java.util.Arrays;
import java.util.Collections;

public class Rotate_Arrays {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*100);
        Integer [] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {

            arr[i]= (int) (Math.random()*100);
        }
        int k = (int)(Math.random()*20);
        k= k%n;
        System.out.println(Arrays.asList(arr));
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
        int i=0;
        int j = k-1;
        while (i<j)
        {
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        System.out.println(k);
        i=k;
        j=n-1;
        while (i<j)
        {
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        System.out.println(Arrays.asList(arr));

    }
}
