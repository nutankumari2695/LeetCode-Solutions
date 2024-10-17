class Solution {
    public boolean hasAlternatingBits(int n) {
        // XOR n with n shifted right by 1
        int x = n ^ (n >> 1);

        // Check if x has all 1s, i.e., x & (x + 1) should be 0
        return (x & (x + 1)) == 0;
    }
}
