class Solution {
    public int mySqrt(int x) {
        int result = 0;
        int bit = 1 << 15;

        while (bit > 0) {
            result |= bit;
            if (result > x / result) {
                result ^= bit;
            }
            bit >>= 1;
        }

        return result;
    }
}












// class Solution {
//     public int mySqrt(int x) {
//         if(x == 0 || x == 1) {
//             return x;
//         }
        
//         long s = 1;
//         long e = x;
//         long m = -1;

//         while(s <= e){
//             m = s + (e - s) / 2;

//             if(m * m > x){
//                 e = m - 1;
//             }else if(m * m == x){
//                 return (int)m;
//             }else{
//                 s = m + 1;
//             }
//         }
//         return (int)m;
//     }
// }