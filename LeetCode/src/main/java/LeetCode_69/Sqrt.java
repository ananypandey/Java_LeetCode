package LeetCode_69;

public class Sqrt
{
    public static Integer sqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;
        int start = 1;
        int end = x;
        int mid = -1;
        while (start <= end) {
            mid = end - (end - start) / 2;
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return Math.round(end);
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int x =8;
        System.out.println(sqrt(x));
    }
}
