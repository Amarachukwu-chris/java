import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int pre = 1;
        for (int i = 0; i < n; i++) {
            res[i] = pre;
            pre *= nums[i];
        }

        int suf = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suf;
            suf *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(s.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
