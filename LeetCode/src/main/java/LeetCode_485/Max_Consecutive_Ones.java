package LeetCode_485;

public class Max_Consecutive_Ones
{
    public static void main(String[] args) {
        int[] nums ={1,1,0,1,1,1};
        int mxlen=Integer.MIN_VALUE;
        int ocunt=0;
        int i=0;
        int n = nums.length;
        while (i<n)
        {
            if(nums[i]==0)
            {
                mxlen = Integer.max(mxlen,ocunt);
                ocunt=0;
            }
            else if(nums[i]==1)
            {
                ocunt++;
            }
            i++;
        }
        mxlen = Integer.max(mxlen,ocunt);
        System.out.println(mxlen);
    }
}
