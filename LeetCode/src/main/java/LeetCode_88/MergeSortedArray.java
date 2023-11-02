package LeetCode_88;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Merging Sorted Array");
        int n = (int)(Math.random()*50);
        int m = (int)(Math.random()*50);
        List<Integer> nums1 = new ArrayList<>(n);
        List<Integer> nums2 = new ArrayList<>(m);
        for(int i =0;i<n;i++)
        {
            nums1.add((int)(Math.random()*100));
        }
        Collections.sort(nums1);
        for(int j=0;j<m;j++)
        {
            nums2.add((int)(Math.random()*100));
        }
        Collections.sort(nums2);
        List<Integer> nums3 = new ArrayList<>();
        int i=0;
        int j=0;
        while (i<n && j<m)
        {
            if(nums1.get(i)<nums2.get(j))
            {
                nums3.add(nums1.get(i));
                i++;
            }
            else if(nums2.get(j) < nums1.get(i))
            {
                nums3.add(nums2.get(j));
                j++;
            }
            else if (nums1.get(i)==nums2.get(j))
            {
                nums3.add(nums1.get(i));
                nums3.add(nums2.get(j));
                i++;
                j++;
            }
        }
        while(i<n)
        {
            nums3.add(nums1.get(i));
            i++;
        }
        while (j<m)
        {
            nums3.add(nums2.get(j));
            j++;
        }
        System.out.println(nums3);
    }
}
