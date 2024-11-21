class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] s= Arrays.stream(nums).map(num ->num * num ).toArray();
        Arrays.sort(s);
        return s;
        
    }
}