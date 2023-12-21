package LeetCode74;

public class Search_a_2D_Matrix
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int [][] matrix = {{1,3,5,7,9},{10,11,16,20,30},{23,30,34,60,70}};
        int target =9;
        boolean isPresent=false;
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            int low = 0;
            int high=matrix[i].length-1;
            while (low<=high)
            {
                int mid = low+(high-low)/2;
                System.out.println(matrix[i][mid]);
                if(matrix[i][mid]==target)
                {
                    System.out.println("Target Found");
                    isPresent=true;
                    break;
                } else if (matrix[i][mid]<target)
                {
                    low=mid+1;
                } else if (matrix[i][mid]>target) {
                    high=mid-1;
                }
            }
            if (isPresent)
                break;
            System.out.println();
        }
        if (!isPresent)
        {
            System.out.println("The target is not present");
        }
    }
}
