class Solution {
    public int maximum69Number (int num) {
        int t= num;
        int idx=0;
        int i=0; 
        while(t>0){
            i++;
            int d= t%10;
            t= t/10;
            if(d==6){
            idx = i;
            }
        }
    
    return num + 3 * (int)Math.pow(10,idx-1);
}
}