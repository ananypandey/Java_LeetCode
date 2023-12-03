package LeetCode_202;

public class HappyNumber
{
    public static boolean isHappy(int n) {
        int j=1;
        while(j==1)
        {
            if(n==1 || n==7)
            {
                return true;
            }
            if(n>1 && n<10)
            {
                return false;
            }
            int sum=0;
            while(n>0)
            {
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        return true;
    }

    public static void main(String[] args) {
        int n =19;
        System.out.println(isHappy(n));
    }
}
