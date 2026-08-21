class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n=nums.length;
       
       /* for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
        }
        return count;*/
       
        HashMap <Integer,Integer> map = new HashMap<>();
       for(int i=0;i<n;i++)
       {
           count += map.getOrDefault(nums[i], 0);
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); 
             
       }
       return count;
    }
}