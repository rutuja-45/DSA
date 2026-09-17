class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int[] result = new int[nums.length];

        int p = 0;
        int n = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > 0) {
                pos[p] = nums[i];
                p++;
            } else {
                neg[n] = nums[i];
                n++;
            }
        }

        for(int i = 0; i < nums.length / 2; i++) {
            result[2 * i] = pos[i];
            result[2 * i + 1] = neg[i];
        }

        return result;
    }
}