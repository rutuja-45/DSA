class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> l1 = new ArrayList<>();
        int greatest=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>greatest)
            {
                greatest=candies[i];
            }
        }

        for(int i=0;i<candies.length;i++)
        {
            boolean check =false;
            int n = candies[i]+extraCandies;
            
                if(n>=greatest)
                {
                   check=true;
                }
                else
                {
                    check=false;
                }
         
            if(check==true)
            {
                l1.add(check);
            }
            else
            {
                l1.add(check);
            }
        }
        return l1;
    }
}