package LeetCode_392;

public class Is_Subsequence {
    public static void main(String[] args) {
        System.out.println("Inside main");
        String str = new String("ahbgdc");
        String sstr = new String("abc");
        int strlen = str.length();
        int sstrlen = sstr.length();
        int j=0;
        boolean flag = false;
        for(int i=0;i<strlen;i++)
        {
            if(str.charAt(i)==sstr.charAt(j))
            {
                j++;
            }
            if(j==sstrlen)
            {
                System.out.println("Given String is Present");
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println("Given String is not Present");
        }
    }
}
