class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int ei = 0; // Even index
        int oi = 1; // Odd index
        int n = nums.length;
        
        while (ei < n && oi < n) {
            // If the number at ei is odd and at oi is even, swap them
            if (nums[ei] % 2 == 1 && nums[oi] % 2 == 0) {
                int t = nums[ei];
                nums[ei] = nums[oi];
                nums[oi] = t;
            }
            
            // Increment ei if it's correctly placed (even index should contain even number)
            if (nums[ei] % 2 == 0) {
                ei += 2;
            }
            
            // Increment oi if it's correctly placed (odd index should contain odd number)
            if (nums[oi] % 2 == 1) {
                oi += 2;
            }
        }
        
        return nums;
    }
}
