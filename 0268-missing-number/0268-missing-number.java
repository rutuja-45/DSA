class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int totalsum=0;
        int n= nums.length;
        for(int i=1;i<=n;i++)
        {
             totalsum += i;
        }
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        
       return totalsum-sum;
    }
}