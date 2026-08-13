class Solution {
    public int removeDuplicates(int[] nums) {
        int right = 1;
        int left = 0;

        while (right < nums.length) {
            if (nums[right] == nums[left]) {
                right++;
            } else {
                left++;
                nums[left] = nums[right];
                right++;
            }
        }

        return left + 1;
    }
}