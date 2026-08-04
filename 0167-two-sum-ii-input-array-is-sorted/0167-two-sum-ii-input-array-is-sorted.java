 class Solution{
 public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int[] reverse =new int[2];
        int sum=0;
       while(start<end)
       { 
           sum=numbers[start]+numbers[end];
           if(sum==target)
           {
                reverse[0] =start+1;
                reverse[1] = end+1;
                return reverse;
           }
           else if(sum>target)
           {
               end--;
           }
           else if(sum<target)
           {
               start++;
           }
           
       }
       return reverse;
    }
 }