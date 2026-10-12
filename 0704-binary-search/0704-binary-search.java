class Solution {
    
    public int search(int[] nums, int target) {
    int n = nums.length;
    int low =0;
    int high= n-1;
    return f(nums ,low,high,target);
    
 }

 public int f(int [] nums ,int  low, int high, int target) {
    if (low>high)
    {
        return -1;
    }
    
    int mid = (low +high)/2;
    if(nums[mid]==target)
    {
        return mid;
       
    }
    else if(target>nums[mid])
    {
       return f(nums,mid+1,high,target);
    }
    else{
    return f(nums,low,mid-1,target);
    }
  }
}
