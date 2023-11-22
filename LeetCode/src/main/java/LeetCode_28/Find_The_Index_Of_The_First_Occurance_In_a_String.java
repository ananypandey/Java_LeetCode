package LeetCode_28;

public class Find_The_Index_Of_The_First_Occurance_In_a_String
{
    public static void main(String[] args) {
        System.out.println("Hi there");
        String haystack = new String("sadbutsad");
        String needle = new String("but");
        int haystacklength = haystack.length();
        int needlelength = needle.length();
        for(int i=0;i<haystacklength-needlelength;i++)
        {
            int j=0;
            for(;j<needlelength;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    break;
                }
            }
            if (j==needlelength)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
