class Solution {
    public int hammingDistance(int x, int y) {
        // XOR of x and y will highlight the bits that are different
        int xor = x ^ y;
        int count = 0;

        // Count the number of 1's in the binary representation of xor
        while (xor > 0) {
            count += xor & 1;  // Check if the least significant bit is 1
            xor >>= 1;         // Right shift xor to check the next bit
        }

        return count;  // Return the total number of differing bits
    }
}
