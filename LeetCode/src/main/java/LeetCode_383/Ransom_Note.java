package LeetCode_383;

public class Ransom_Note {
    public static void main(String[] args) {
        String ransomNote ="egg";
        String magazine = "add";
        int[] freq = new int[26];
        boolean flag = true;
        for(int i=0;i<magazine.length();i++)
        {
            freq[magazine.charAt(i)-96]++;
        }
        for(int j=0;j<ransomNote.length();j++)
        {
            if(freq[ransomNote.charAt(j)-96]==0)
            {
                System.out.println("Can't be formed");
                flag=false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("Can be formed");
        }
    }
}
