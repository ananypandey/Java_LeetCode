package LeetCode_9;

public class Palindrome_Number
{
    public static boolean isPalindrome(Integer x)
    {
        int og =x;
        int rev=0;
        while (x>0)
        {
          rev=rev*10+x%10;
          x=x/10;
        }

        return rev==og;
    }
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Integer x = (int)(Math.random()*10000);
        System.out.println(x);
        System.out.println(isPalindrome(x));
    }
}
