import java.util.HashSet;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;
        
        // Calculate total candies for Alice and Bob
        for (int x : aliceSizes) sumAlice += x;
        for (int y : bobSizes) sumBob += y;
        
        // Calculate the target difference needed to equalize
        int delta = (sumAlice - sumBob) / 2;

        // Store Bob's candy sizes in a HashSet for quick lookup
        HashSet<Integer> bobSet = new HashSet<>();
        for (int y : bobSizes) bobSet.add(y);

        // Find a valid swap where Alice's candy count is adjusted by `delta`
        for (int x : aliceSizes) {
            int y = x - delta;
            if (bobSet.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[0]; // Should not reach here due to guaranteed solution
    }
}
