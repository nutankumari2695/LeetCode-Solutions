class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;

        // int bitLength = Integer.toBinaryString(num).length();
        int len = (int)(Math.log(num)/Math.log(2))+1;
        
        int mask = (1 << len) - 1;
        
        return num ^ mask;
    }
}