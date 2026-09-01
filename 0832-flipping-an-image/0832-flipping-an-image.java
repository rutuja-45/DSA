class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] result = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {

            // Flip + invert
            int k = 0;

            for (int j = image[i].length - 1; j >= 0; j--) {

                if (image[i][j] == 0) {
                    result[i][k] = 1;
                } else {
                    result[i][k] = 0;
                }

                k++;
            }
        }

        return result;
    }
}