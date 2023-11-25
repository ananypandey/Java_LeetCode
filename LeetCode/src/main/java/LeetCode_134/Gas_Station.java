package LeetCode_134;

public class Gas_Station {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20);
        int[] gas = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            gas[i] = (int) (Math.random() * 20);
            cost[i] = (int) (Math.random() * 20);
        }
        int st = -1;
        int sum = 0;
        int asum = 0;

        for (int i = 0; i < n; i++) {
            gas[i] = gas[i] - cost[i];
            sum += gas[i];
            asum += gas[i];
            if (asum < 0) {
                asum = 0;
                st = i + 1;
            } else if (st == -1) {
                st = i;
            }
        }
        if (sum < 0) {
            System.out.println(-1);
        }
        else
        {
            System.out.println(st);
        }
    }
}
