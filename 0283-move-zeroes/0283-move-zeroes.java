class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        
        // First pass: Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }
        
        // Second pass: Fill the remaining positions with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
