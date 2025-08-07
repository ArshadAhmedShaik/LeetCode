class Solution {
    public String largestGoodInteger(String num) {
      char ch = (char) 0;
      for(int i = 0;i <= num.length() - 3;i++) {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+1)==num.charAt(i+2)) {
                 if(ch<num.charAt(i)) {
                    ch = num.charAt(i);
                 }
            }
      }
            if(ch == (char)0) {
                    return "";
            } else {
                return "" + ch + ch + ch;
            }
    }
}