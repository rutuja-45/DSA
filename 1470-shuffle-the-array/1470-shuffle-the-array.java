class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p=nums.length;
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length-1;i=i+2)
        {
            ans[i]=nums[i/2];
            ans[i+1]=nums[n+i/2];
        }
        return ans;
    }
}