class Solution {
    public String addBinary(String a, String b) {
         StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            carry = sum / 2;  // Calculate the carry for the next iteration
            result.append(sum % 2);  // Append the current binary digit
        }
        
        return result.reverse().toString();  // Reverse to get the correct binary order
    }
}

//         StringBuilder str = new StringBuilder();
//         int i = a.length()-1,j=b.length()-1;
//         int c = 0,k=0;
//         while(i>=0 && j>=0){
//             if(a.charAt(i)=='1' && b.charAt(j)=='1'){
//                 if(c==1){
//                     str.append('1');
//                     c=1;
//                 }
//                 else{
//                     str.append('0');
//                     c=1;
//                 }
//             }
//             else if((a.charAt(i)=='0' && b.charAt(j)=='1') || (a.charAt(i)=='1' && b.charAt(j)=='0')){
//                 if(c==1){
//                     str.append('0');
//                     c=1;
//                 }
//                 else{
//                     str.append('1');
//                 }
//             }
//             else{
//                 if(c==1){
//                     str.append('1');
//                     c=0;
//                 }
//                 else{
//                     str.append('0');
//                 }
//             }
//             i--;j--;
//         }
//         while(i>=0){
//             if(a.charAt(i)=='1'){
//                 if(c==1){
//                     str.append('0');
//                     c=1;
//                 }
//                 else{
//                     str.append('1');
//                 }
//             }
//             else{
//                 if(c==1){
//                     str.append('1');
//                     c=0;
//                 }
//                 else{
//                     str.append('0');
//                 }
//             }
//             i--;
//         }
//         while(j>=0){
//             if(b.charAt(j)=='1'){
//                 if(c==1){
//                     str.append('0');
//                     c=1;
//                 }
//                 else{
//                     str.append('1');
//                 }
//             }
//             else{
//                 if(c==1){
//                     str.append('1');
//                     c=0;
//                 }
//                 else{
//                     str.append('0');
//                 }
//             }
//             j--;
//         }
//         if(c==1){
//             str.append('1');
//         }
//         return str.reverse().toString();
//     }
// }