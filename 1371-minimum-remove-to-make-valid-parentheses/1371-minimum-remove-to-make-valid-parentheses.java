class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
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

        for (int i = n - 1; i >= 0 && count > 0; i--) {
            if (arr[i] == '(') {
                arr[i] = 0;
                count--;
            }
        }

        char[] result = new char[n];
        int idx = 0;
        for (char c : arr) {
            if (c != 0) result[idx++] = c;
        }

        return new String(result, 0, idx);
    }
}
