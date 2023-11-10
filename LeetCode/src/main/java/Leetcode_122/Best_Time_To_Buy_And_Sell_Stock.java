package Leetcode_122;

public class Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*50);
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= (int)(Math.random()*50);
        }
        int gain =0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]>0)
            {
                gain += arr[i]-arr[i-1];
            }
        }
        System.out.println(gain);
    }
}
