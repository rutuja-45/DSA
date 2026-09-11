class Solution {
    public int maxAscendingSum(int[] nums) {

        int i = 0;
        int j = 1;

        int sum = nums[0];
        int maxSum = nums[0];

        while (j < nums.length) {

            if (nums[i] < nums[j]) {
                sum += nums[j];
            } 
            else {
                maxSum = Math.max(maxSum, sum);
                sum = nums[j];
            }

            i++;
            j++;
        }

        return Math.max(maxSum, sum);
    }
}