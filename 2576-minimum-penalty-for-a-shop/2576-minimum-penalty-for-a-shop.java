class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] left = new int[n];
        int[] right = new int[n];

         // left side -> "N"

         for(int i = 0;i < n;i++) {
            if(customers.charAt(i) == 'N') left[i] = (i==0) ? 1 : left[i-1] + 1;
            else left[i] = (i==0) ? 0 : left[i-1];
         }

         // right side -> "Y"

         for(int i = n - 1;i >= 0;i--) {
                if(customers.charAt(i) == 'Y') right[i] = (i==n-1) ? 1 : right[i+1] + 1;
                else right[i] = (i==n-1) ? 0 : right[i+1]; 
         }

        int minHours = -1;
        int minPenalty = Integer.MAX_VALUE;

         for(int i = 0;i <= n;i++) {
                int leftPenalty = (i==0) ? 0 : left[i-1];
                int rightPenalty = (i==n) ? 0 : right[i];
                int totalPenalty = leftPenalty + rightPenalty;
                if(totalPenalty<minPenalty) {
                        minPenalty = totalPenalty;
                        minHours = i;
                }
         }
         return minHours;
    }
}