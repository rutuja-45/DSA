class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n= nums.length;
        HashMap <Integer , Integer> h1 = new HashMap <>();
        h1.put(0,1);
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
           int remainder = Math.floorMod(sum, k);
            if(h1.containsKey(remainder))
            {
                count +=h1.get(remainder);
                h1.put(remainder , h1.get(remainder)+1);
            }
            else
            {
                h1.put(remainder, 1);
            }            
        }
        return count;
    }
}