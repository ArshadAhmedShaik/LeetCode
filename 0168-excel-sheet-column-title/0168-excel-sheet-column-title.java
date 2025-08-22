class Solution {
    public String convertToTitle(int columnNumber) {
             int n = columnNumber; 
        StringBuilder res = new StringBuilder();
             while(n>0) {
                n = n - 1;
                int digit = n % 26;  
                char ch = (char)('A'+digit);
                res.append(ch);
                n /= 26;
             }
             return res.reverse().toString();
    }
}