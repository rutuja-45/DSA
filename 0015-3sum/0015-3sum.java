class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int target =0;
        int n=nums.length;
        int i;
        for(i=0;i<n-2;i++)
        {
            int j= i+1;
           int k=nums.length-1;
           if (i> 0 && nums[i] == nums[i - 1]) {
            continue;
            }
        while(j<k)
        {
            
            
            int sum = nums[i]+nums[j]+nums[k];
            if (sum== target)
            {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) {
                j++;
               }
               while (j < k && nums[k] == nums[k + 1]) {
               k--;
             }
            }
            else if(sum>target)
            {
                    k--;
            }
            else
            {
                j++;
            }
        }
     }
        return result;
    }
}