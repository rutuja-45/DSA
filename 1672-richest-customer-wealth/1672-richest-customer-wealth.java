class Solution {
    public int maximumWealth(int[][] accounts) {
        int j,i;
        int maxSum=Integer.MIN_VALUE;
        for(i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(j=0;j<accounts[i].length;j++)
            {
                sum += accounts[i][j];
            }
            maxSum= Math.max(sum,maxSum);
        }
        return maxSum;
    }
}