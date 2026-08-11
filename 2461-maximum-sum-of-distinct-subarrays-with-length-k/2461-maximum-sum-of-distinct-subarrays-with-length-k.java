class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        long sum = 0;
        long maxSum = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element to sum
            sum += nums[right];

            // Add current element to map
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Keep window size at most k
            if (right - left + 1 > k) {

                // Remove left element from sum
                sum -= nums[left];

                // Decrease its frequency
                map.put(nums[left], map.get(nums[left]) - 1);

                // If frequency becomes 0, remove it completely
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Window has k elements AND all are distinct
            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}