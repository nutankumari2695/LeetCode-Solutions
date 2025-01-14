class Solution {
    public int heightChecker(int[] heights) {
         int[] expected = heights.clone();
        Arrays.sort(expected);
        
        int mismatchCount = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }
        
        return mismatchCount;
    }
}