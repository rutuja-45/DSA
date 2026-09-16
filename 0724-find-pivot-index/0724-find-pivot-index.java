class Solution {
    public int pivotIndex(int[] nums) {

    int totalsum=0;
    for(int i:nums)
    {
        totalsum += i;
    }

    int leftsum=0;
    for(int i=0;i<nums.length;i++)
    {
         
        int rightsum= totalsum-leftsum-nums[i];
        if(leftsum==rightsum)
        {
            return i;
        }
        leftsum+=nums[i];
    }
    return -1;
    }
}




/* Brute force
        for(int i = 0; i < nums.length; i++) {

            int leftsum = 0;

            for(int j = 0; j < i; j++) {
                leftsum += nums[j];
            }

            int rightsum = 0;

            for(int k = i + 1; k < nums.length; k++) {
                rightsum += nums[k];
            }

            if(leftsum == rightsum) {
                return i;
            }
        }

        return -1;
*/