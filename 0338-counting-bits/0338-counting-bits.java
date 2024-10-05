class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}










// import java.util.Arrays;

// class Solution {
//     public int[] countBits(int n) {
//         int[] res = new int[n + 1]; // Result array to store count of bits
        
//         for (int i = 0; i <= n; i++) {
//             int cnt = 0;
//             int num = i; // Temporary variable to manipulate without affecting `i`
//             while (num != 0) {
//                 num = num & (num - 1); // Remove the last set bit
//                 cnt++;
//             }
//             res[i] = cnt; // Store the count of set bits for number `i`
//         }
        
//         return res; // Return the result array
//     }
// }
