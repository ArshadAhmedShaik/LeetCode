class Solution {
    public String largestGoodInteger(String num) {
        char maxChar = 0;

        for (int i = 0; i <= num.length() - 3; i++) {
            char ch = num.charAt(i);
            if (ch == num.charAt(i + 1) && ch == num.charAt(i + 2)) {
                if (ch > maxChar) {
                    maxChar = ch;
                }
            }
        }

        return maxChar == 0 ? "" : new String(new char[]{maxChar, maxChar, maxChar});
    }
}
