class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        for (int len = String.valueOf(low).length(); len <= String.valueOf(high).length(); len++) {
            for (int start = 0; start + len <= 9; start++) {
                int num = Integer.parseInt(digits.substring(start, start + len));
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}
