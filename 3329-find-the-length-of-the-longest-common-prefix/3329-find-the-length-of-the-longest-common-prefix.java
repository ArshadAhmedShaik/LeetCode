class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> prefixSet = new HashSet<>(arr1.length * 9);

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
            int digits = 0;

            int temp = num;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

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
}
