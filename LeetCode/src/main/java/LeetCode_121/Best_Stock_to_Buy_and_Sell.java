package LeetCode_121;

public class Best_Stock_to_Buy_and_Sell {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        int n = (int)(Math.random()*20);
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=(int)(Math.random()*20);
        }
        int [] prefix_Max = new int[n-1];
        for(int i = n-2;i>=0;i--)
        {
            if(i==n-2)
            {
                prefix_Max[i]=arr[n-1];
            }
            else
            {
                prefix_Max[i]= Integer.max(prefix_Max[i+1],arr[i+1]);
            }
        }
        System.out.println("Printing Array Values : ");
        System.out.println();
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("Printing Prefix Max");
        System.out.println();
        for (int i=0;i<n-1;i++)
        {
            System.out.print(prefix_Max[i] + " ");
        }
        System.out.println();
        System.out.println("Gain : ");
        int gain =0;
        for(int i=0;i<n-1;i++)
        {
            gain = Integer.max(gain,prefix_Max[i]-arr[i]);
    
        }
        System.out.println(gain);
    }
}
