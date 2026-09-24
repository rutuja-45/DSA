class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List <Integer>> ans = new ArrayList<>();
        int n= numRows;
        for(int i=0;i<n;i++)
        {
                List <Integer> l1 = new ArrayList <>();
                l1.add(1);
                for(int j=0;j<i-1;j++)
                {

                    l1.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1));
                }

                if(i>=1)
                {
                    l1.add(1);
                }
                ans.add(l1);
        }

 return ans;
    }
}