

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int n = Math.abs(nums[i]); // Get the index for the 
            int seat = n-1;
            
            if (nums[seat] < 0) {
                res.add(n ); // Add the duplicate element (convert index back to number)
            } else {
                nums[seat] = -nums[seat]; // Mark the number as visited by negating it
            }
        }
        
        return res; // Return the result after the loop
    }
}


