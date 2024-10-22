  
        import java.util.HashSet;
import java.util.PriorityQueue;

class Solution {
    public int thirdMax(int[] nums) {
      
        HashSet<Integer> set = new HashSet<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                minHeap.add(num);
                
               
                if (minHeap.size() > 3) {
                    minHeap.poll();
                }
            }
        }
        
        if (minHeap.size() < 3) {
            while (minHeap.size() > 1) {
                minHeap.poll(); 
            }
        }
        
        return minHeap.peek(); 
   

    }
}