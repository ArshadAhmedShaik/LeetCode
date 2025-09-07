class Solution {
    public String minRemoveToMakeValid(String s) {
           int n = s.length();
           char[] sb = new char[n];
           int count = 0;
           int index = 0;
           for(int i = 0;i < n;i++) {
                char ch = s.charAt(i);
                if(Character.isLetter(ch)) {
                        sb[index++] = ch;   
                }
                else if(ch == '(') {
                        count++;
                        sb[index++] = ch;
                } else if(count > 0 && ch == ')') {
                        sb[index++] = ch;
                        count--;
                }
           }
           char[] ans1 = Arrays.copyOf(sb, index);
           StringBuilder ans = new StringBuilder();
           for(int i = ans1.length - 1;i>=0;i--) {
                if(sb[i] == '(' && count > 0) {
                        count--;
                } else {
                        ans.append(sb[i]);
                }
           }
        return ans.reverse().toString();
    }    
}