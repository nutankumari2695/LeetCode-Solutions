import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            int key = nums2[i];
            if (map.containsKey(key)) {
                result.add(key);
                map.remove(key);
            }
        }
        
        int[] intersectArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersectArray[i] = result.get(i);
        }
        
        return intersectArray;
    }
}
