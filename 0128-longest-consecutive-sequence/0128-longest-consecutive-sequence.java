class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int longest=1;
        Set <Integer> s1 = new HashSet<>();
        if(n==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            s1.add(nums[i]);
        }
        for(int it:s1)
        {
            if(!s1.contains(it-1))
            {
             cnt = 1;
             int x = it;   

             while( s1.contains(x+1) )
             {
                x=x+1;
                cnt++;
             }
             longest = Math.max(longest, cnt);
            }

        }
        return longest;
    }
}























 /*  brute force 
     boolean flag=false;
        int longest=1;
        
       if(nums.length == 0)
       {
         return 0;
       }
        for(int i=0;i<n;i++)
        { 
            int x=nums[i];
            int count=1;
           
            while(linearsearch(nums,x+1)==true)
            {
               x=x+1;
               count=count+1; 
            }
            longest = Math.max(count, longest);
        }

        return longest;
    }

     boolean linearsearch(int [] nums,int x)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==x)
                {
                    return true;
                }
            }
             return false;
        }
*/
