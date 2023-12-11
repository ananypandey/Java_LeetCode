package LeetCode66;

import java.util.Arrays;

public class PlusOne
{
    static Integer[] plusOne(Integer[] digits)
    {
//        Arrays.asList(digits).stream().forEach(i->{
//        });
        int n = digits.length;
        int i=n-1;
        for(;i>=0;i--)
        {
            if(digits[i]==9)
            {
                digits[i]=0;
                continue;
            }
            digits[i]=digits[i]+1;
            return digits;
        }
        Integer[] ans = new Integer[n+1];
        ans[0]=1;
        for(int j=1;j<n+1;j++)
        {
            ans[j]=0;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Integer[] digits = {7,9};
        System.out.println(Arrays.asList(plusOne(digits)));
    }
}
