package LeetCode_6;

public class ZigZag_Conversion {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        String str = "PAYPALISHIRING";
        int n = (int)(Math.random()*3);
        System.out.println(n);
        if(n==0 || n==1)
        {
            System.out.println(str);
        }
        else
        {
            StringBuilder answer = new StringBuilder();
            int diff = 2*(n-1);
            int diagonalDiff = diff;
            int secondIndex;
            int index;
            for(int i=0;i<n;i++)
            {
                index=i;
                while (index<str.length())
                {
                   answer.append(str.charAt(index)) ;
                   if(i!=0 && i!=n-1)
                   {
                       diagonalDiff = diff-2*i;
                       secondIndex=index+diagonalDiff;
                       if(secondIndex<str.length())
                       {
                           answer.append(str.charAt(secondIndex));
                       }
                   }
                   index+=diff;
                }
            }
            System.out.println(answer.toString());
        }

    }
}
