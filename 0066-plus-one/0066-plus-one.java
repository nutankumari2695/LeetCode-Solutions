class Solution {
    public int[] plusOne(int[] digits) {
         int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;  
            }
            digits[i] = 0;  
        }
        int[] newarr = new int[n + 1];
        newarr[0] = 1; 
        return newarr;

        
        // int n = digits.length;
        // int ans =0;
        // for(int i=n-1 ; i>0; i--){
        //     ans = ans + n%10  ;
        //     n /= 10 ; 
        //     ans++;
        // }
        // return digits ;
        
// int ans=0;
//         for(int i=0;i<digits.length;i++){
//             ans=ans*10+digits[i];
//         }
        
//         ans=ans+1;
//        String s1=String.valueOf(ans);
//         int l=s1.length();
//         int arr[]=new int[l];
        
//         int po=(int)Math.pow(10,l-1);
       
//         int j=0;
//         while(ans>0){
//             arr[j++]=ans/po;
//             ans=ans%po;
//             po=po/10;
            
//         }
        
//         return arr;
        
//         int arr[]=new int[digits.length+1];
//         int l=digits.length-1;
//         for(int i=l;i>=0;i--){
//             if(digits[i]+1<9){
                
//             }
//         }
//         int arr[];
//         int l=digits.length;
//         if(digits[0]<9){
//              arr=new int[l];
//         }else{
//          arr=new int[l+1];
            
//         }
//         if(digits[l-1]<9){
//             arr[l-1]=digits[l-1]+1;
//             for(int i=0;i<l-1;i++){
//                 arr[i]=digits[i];
//             }
//         }  else{
//             arr[l-1]=0;
//             int i;
//             for( i=l-1;i>=0;i--){
//                 if(digits[i]+1<=9){
//                     arr[i]=digits[i]+1;
//                     break;
                    
//                 }else{
//                     arr[i]=0;
                    
//                 }
//             }
            
            
            
//         }
//         return arr;
        
        
        
        
    }
}