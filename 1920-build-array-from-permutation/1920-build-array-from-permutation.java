class Solution {
    public int[] buildArray(int[] nums) {
        int [] result= new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int n= nums[num];
            result[i]=n;
        }
        return result;
    }
}