class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];
        int[] count = new int[101];

        // Count occurrences
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Find how many numbers are smaller
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = 0; j < nums[i]; j++) {
                sum += count[j];
            }

            result[i] = sum;
        }

        return result;
    }
}