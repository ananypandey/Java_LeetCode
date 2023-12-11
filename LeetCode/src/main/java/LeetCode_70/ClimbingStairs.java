package LeetCode_70;

public class ClimbingStairs
{
    static int climStairs(int n)
    {
        int[] arr = new int[n];
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        System.out.println("Inside Climbing Stairs");
        int n= (int)(Math.random()*45);
        System.out.println(n);
        if(n>=1)
        {
            System.out.println(climStairs(n));
        }
    }
}
