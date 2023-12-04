package LeetCode_11;

public class Container_With_Most_Water
{
    public static int maxArea(int[] height)
    {
        int mxArea=Integer.MIN_VALUE;
        int i=0;
        int j= height.length-1;
        while (i<j)
        {
            mxArea=Integer.max(mxArea,Integer.min(height[i],height[j])*(j-i));
            if(height[i]>height[j])
            {
                j--;
            }
            else if(height[j]>=height[i])

            {
                i++;
            }
        }
        return mxArea;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
