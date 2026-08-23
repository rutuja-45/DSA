class Solution {
    public int longestOnes(int[] nums, int k) {

        /*  Brute force O(n^2)
            int maxCount=0;
            for(int i=0;i<nums.length;i++)
            {
                int count=0;//count refers to here number of elements in the window
                int zeroCount=0;

                for(int j=i;j<nums.length;j++)
                {
                    if(nums[j]==0)
                    {
                        zeroCount++;
                    }

                    if(zeroCount>k)
                    {
                         break;
                    }
                    count++;
                    maxCount=Math.max(count,maxCount);
                }    
            }
             return maxCount;*/

    int left=0;
    int maxCount=0;
    int zeroCount=0;
    int n=nums.length;
    for (int right = 0; right < n; right++) {

    if (nums[right] == 0) {
        zeroCount++;
    }

    while (zeroCount > k) {
        if (nums[left] == 0) {
            zeroCount--;
        }
        left++;
    }

    maxCount = Math.max(maxCount, right - left + 1);
}
return maxCount;   
        
    }     
    
}