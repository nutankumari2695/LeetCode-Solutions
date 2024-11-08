class Solution {
    public boolean checkRecord(String s) {
         int absences = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absences++;
                if (absences >= 2) {
                    return false; // More than 1 absence
                }
            }
        }

        // Check if there are 3 or more consecutive 'L's
        if (s.contains("LLL")) {
            return false; // 3 or more consecutive 'L's
        }

        return true;
    }
}