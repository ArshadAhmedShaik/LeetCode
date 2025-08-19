class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixSet = new HashSet<>();
        for (int num : arr1) {
            int n = num;
            while (n > 0) {
                prefixSet.add(n);
                n /= 10;
            }
        }

        int maxLength = 0;

        for (int num : arr2) {
            int n = num;
            int digits = digitCount(num);
            while (n > 0) {
                if (prefixSet.contains(n)) {
                    maxLength = Math.max(maxLength, digits);
                }
                n /= 10;
                digits--;
            }
        }

        return maxLength;
    }

    private int digitCount(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
