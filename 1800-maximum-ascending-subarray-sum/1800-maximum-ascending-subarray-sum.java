class Solution {
    public int maxAscendingSum(int[] nums) {

        int sum = nums[0];
        int maxSum = nums[0];

        for (int j = 1; j < nums.length; j++) {

            if (nums[j - 1] < nums[j]) {
                sum += nums[j];
            } 
            else {
                maxSum = Math.max(maxSum, sum);
                sum = nums[j];
            }
        }

        maxSum = Math.max(maxSum, sum);

        return maxSum;
    }
}