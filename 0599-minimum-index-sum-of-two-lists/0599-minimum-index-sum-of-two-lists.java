import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Store strings from list1 with their indices
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        
        int minIndexSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        
        // Iterate through list2 and find common strings
        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int indexSum = j + map.get(list2[j]);
                
                // Check if we found a new minimum index sum
                if (indexSum < minIndexSum) {
                    minIndexSum = indexSum;
                    result.clear(); // Clear previous results
                    result.add(list2[j]); // Add the new common string
                } else if (indexSum == minIndexSum) {
                    result.add(list2[j]); // Add to the result if it matches the min index sum
                }
            }
        }
        
        // Convert the result list to an array and return
        return result.toArray(new String[0]);
    }
}