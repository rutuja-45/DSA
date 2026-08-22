class Solution {
    public int trap(int[] height) {


        /* Brute force
        int water = 0;

        for (int i = 1; i < height.length - 1; i++) {

            int leftMax = 0;
            int rightMax = 0;

            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            for (int j = i + 1; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            int trapped = Math.min(leftMax, rightMax) - height[i];

            if (trapped > 0) {
                water += trapped;
            }
        }*/
        //Optimized O(n)
        int left=0;
        int right=height.length-1;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        int totalwater=0;
        while(left<right)
        {
                leftMax=Math.max(leftMax,height[left]);
                rightMax=Math.max(rightMax,height[right]);

                if(leftMax<rightMax)
                {
                   totalwater += leftMax-height[left];
                    left++;
                }
                else
                {
                    totalwater += rightMax-height[right];
                    right--;
                }

        }
       return totalwater;
    }
}