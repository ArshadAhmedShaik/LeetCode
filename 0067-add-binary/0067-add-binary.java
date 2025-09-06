class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                int num1 = a.charAt(i) - '0';
                sum += num1;
            }
            if (j >= 0) {
                int num2 = b.charAt(j) - '0';
                sum += num2;
            }
            carry = sum / 2;
            int print = (sum % 2);
            sb.append((char) (print + '0'));
            i--;
            j--;
        }
        if (carry == 1) {
            sb.append("1");
        }
        sb.reverse();
        return sb.toString();
    }
}