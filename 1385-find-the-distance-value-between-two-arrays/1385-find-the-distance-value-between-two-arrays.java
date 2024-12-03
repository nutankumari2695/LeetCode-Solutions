class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int n1:arr1){
             boolean isValid = true;
        
        for(int n2:arr2){
            if(Math.abs(n1-n2) <=d){
                isValid = false;
                break;
            }
           
        }
            if(isValid){
                 count++;
            }
        }
        return count;
        
    }
}