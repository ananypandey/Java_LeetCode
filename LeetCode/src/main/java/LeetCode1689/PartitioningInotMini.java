package LeetCode1689;

public class PartitioningInotMini
{
    public static void main(String[] args) {
        System.out.println("inside main");
        String str = "82734";
        int j = 0;
        for(int i=0;i<str.length();i++)
        {
            if(j<Character.getNumericValue(str.charAt(i)))
                j=Character.getNumericValue(str.charAt(i));
        }
        System.out.println(j);
    }
}
