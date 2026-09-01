class Solution {
    
    int maxcount=0;
    public int findNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int digitcount=0;
            int temp=nums[i];

            while(temp>0)
            {
               temp = temp/10;
               digitcount++;
            }
            if(digitcount%2==0)
            {
              maxcount++;
            }
        }
        return maxcount;
    }
}