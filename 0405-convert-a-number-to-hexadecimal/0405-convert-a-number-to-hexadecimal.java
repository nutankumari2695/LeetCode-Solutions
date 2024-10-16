class Solution {
    public String toHex(int num) {
        if (num == 0) return "0"; // Base case for zero

        long n = num & 0xFFFFFFFFL; // Treat the number as unsigned (32-bit)
        StringBuilder ans = new StringBuilder();
        String hexcode = "0123456789abcdef"; // Hexadecimal digits

        // Process the number, taking digits from the least significant to the most significant
        while (n > 0) {
            int rem = (int) (n % 16); // Get remainder when divided by 16
            ans.append(hexcode.charAt(rem)); // Append the corresponding hex character
            n /= 16; // Reduce n by dividing by 16
        }

        return ans.reverse().toString(); // Reverse the result and convert to a string
    }
}
