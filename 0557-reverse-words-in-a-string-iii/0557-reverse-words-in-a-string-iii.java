class Solution {
    public String reverseWords(String s) {
      StringBuilder sb = new  StringBuilder();
        String[] w= s.split(" ");
        for(String ws: w){
             StringBuilder tmp = new  StringBuilder(ws);
            tmp.reverse();
            sb.append(tmp);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}