class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] left = new int[n+1];
        
        for (int i = 1; i <= n; i++) {
            left[i] = left[i-1] + (customers.charAt(i-1) == 'N' ? 1 : 0);
        }
        
        int[] right = new int[n+1];
        for (int i = n-1; i >= 0; i--) {
            right[i] = right[i+1] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }
        
        int minPenalty = Integer.MAX_VALUE;
        int minHour = 0;
        for (int i = 0; i <= n; i++) {
            int penalty = left[i] + right[i];
            if (penalty < minPenalty) {
                minPenalty = penalty;
                minHour = i;
            }
        }
        
        return minHour;
    }
}
