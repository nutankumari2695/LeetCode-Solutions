class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
         Arrays.sort(arr);

        // Step 2: Calculate the common difference from the first two elements
        int diff = arr[1] - arr[0];

        // Step 3: Check if all consecutive differences are the same
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }

        return true;
    }
}