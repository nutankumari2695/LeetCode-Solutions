class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        // If the string length is less than 2, it cannot be formed by repeating a substring
        if (n < 2) {
            return false;
        }
        
        // Concatenate the string with itself
        String doubled = s + s;
        
        // Check if the original string appears in the doubled string
        // We need to skip the first and last character to avoid matching the entire string
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }
}