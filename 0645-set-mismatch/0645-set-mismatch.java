

class Solution {
    public int[] findErrorNums(int[] nums) {
        
//         boolean[] arr = new boolean[nums.length+1];
//         int[] res= {0,0};
//         for(int n:nums){
//             if(arr[n]==true){
//                 res[0]=n;
//             }else{
//                 arr[n]=true;
//             }
//             for(int i=1; i<nums.length; i++){
//                 if(arr[i]==false){
//                     res[1]=i;
//                 }
//             }
            
//         }
//         return res;
//     }
// }
        
        
        
        int dup = -1, missing = -1;
        
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 2) {
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }
        
        return new int[] {dup, missing};
    }
}

