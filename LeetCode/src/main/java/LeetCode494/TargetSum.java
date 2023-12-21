package LeetCode494;

public class TargetSum {
    static int count = 0;

    static void Traverse(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target)
                count++;
            return;
        }
        if (index > nums.length)
            return;

        Traverse(nums, target, index + 1, sum + nums[index]);
        Traverse(nums, target, index + 1, sum - nums[index]);
    }

    static void findTargetSumWays(int[] nums, int target) {
        Traverse(nums, target, 0, 0);
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("inside Main");
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        findTargetSumWays(nums, target);
    }
}
