class Solution {
    public int strStr(String haystack, String needle) {
        
  int hLen = haystack.length();
        int nLen = needle.length();
        if (nLen == 0) {
            return 0;
        }
        for (int i = 0; i <= hLen - nLen; i++) {
           
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) {
                return i;
            }
        }
        return -1;      
        
        
//         if (haystack.length() < needle.length()) {
//             return -1;
//         }
        
//         for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//             if (haystack.substring(i, i + needle.length()).equals(needle)) {
//                 return i;
//             }
//         }
        
//         return -1;        
    }
}