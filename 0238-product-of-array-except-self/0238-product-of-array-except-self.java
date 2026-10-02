class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int [] result = new int[n];
        int prefix = 1;
  
        for(int i=0;i<n;i++)
        {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int suffix =1;
        
         for(int i = n - 1; i >= 0; i--)
        {
            result[i] *= suffix;
            suffix *= nums[i];
        }

        return result;
    }
}

/* brute force 
for(int i=0;i<n;i++)
        {
            int product = 1;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                product *= nums[j];
            }
            result[i] = product; 
        }*/