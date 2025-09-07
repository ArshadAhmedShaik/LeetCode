class Solution {
    public String minRemoveToMakeValid(String s) {
           StringBuilder sb = new StringBuilder();
           int n = s.length();
           int count = 0;
           for(int i = 0;i < n;i++) {
                char ch = s.charAt(i);
                if(Character.isLetter(ch)) sb.append(ch);
                else if(ch == '(') {
                        count++;
                        sb.append(ch);
                } else if(count > 0 && ch == ')') {
                        sb.append(ch);
                        count--;
                }
           }
           StringBuilder ans = new StringBuilder();
           for(int i = sb.length()-1;i>=0;i--) {
                if(sb.charAt(i) == '(' && count > 0) {
                        count--;
                } else {
                        ans.append(sb.charAt(i));
                }
           }
        return ans.reverse().toString();
    }    
}