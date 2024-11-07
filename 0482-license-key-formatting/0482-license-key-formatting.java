class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String cleaned = s.replaceAll("-", "").toUpperCase();
        
        StringBuilder formatted = new StringBuilder();
        int firstGroupLength = cleaned.length() % k; // Length of the first group

        // Append the first group if it's non-empty
        if (firstGroupLength > 0) {
            formatted.append(cleaned.substring(0, firstGroupLength));
        }

        // Append remaining groups
        for (int i = firstGroupLength; i < cleaned.length(); i += k) {
            if (formatted.length() > 0) { // Add dash between groups
                formatted.append("-");
            }
            formatted.append(cleaned.substring(i, i + k));
        }

        return formatted.toString();
    }
}