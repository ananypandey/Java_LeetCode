package LeetCode_238;

import java.util.Arrays;

public class Product_Of_Self_Producr
{
    public static void main(String[] args) {
        int n = (int)(Math.random()*10);
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = (int)(Math.random()*30);
        }
        System.out.println(Arrays.asList(arr));
        Integer[] prefix = new Integer[n];
        prefix[0]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        System.out.println(Arrays.asList(prefix));
        int suffix =1;
        Integer[] ans = new Integer[n];
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=prefix[i]*suffix;
            suffix=suffix*arr[i];
        }
        System.out.println(Arrays.asList(ans));
    }
}
