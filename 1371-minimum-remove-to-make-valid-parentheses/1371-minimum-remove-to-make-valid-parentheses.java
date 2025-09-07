class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '(') {
                count++;
            } else if (arr[i] == ')') {
                if (count == 0) {
                    arr[i] = 0; 
                } else {
                    count--;
                }
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == '(' && count-- > 0) continue; 
            if (arr[i] != 0) sb.append(arr[i]);
        }

        return sb.reverse().toString();
    }
}
