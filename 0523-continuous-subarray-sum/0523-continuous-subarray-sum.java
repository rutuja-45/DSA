class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer , Integer> h1 = new HashMap<>();
        h1.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            int remainder = sum % k;
            if(h1.containsKey(remainder))
            {
                if(i-h1.get(remainder)>=2)
                {
                    return true;
                }            
            }
            else
                {
                      h1.put(remainder, i);
                }
          
        }
        return false;

    }
}