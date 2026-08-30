class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        while(j<nums.length)
        {
            
            sum +=nums[j];
            
            if(sum>=target)
            {
                while(sum>=target)
                {
                    minLength =Math.min(minLength,j-i+1);
                    sum-=nums[i];
                    i++;
                }
            }
            j++;
        }
        if (minLength == Integer.MAX_VALUE)
        {
        return 0;
        }
        else
        {
            return minLength;
        }
    }
}