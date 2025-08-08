class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int n = tickets.length;
       int res = 0;
       int target = tickets[k];
       for(int i = 0;i < n;i++) {
            if(i<=k) {
                    if(tickets[i]<=tickets[k]) {
                            res += tickets[i];
                    } else {
                        res += Math.min(tickets[i], tickets[k]);
                    }
            } else {
                if(tickets[i]<tickets[k]) {
                        res += tickets[i];
                } else {
                    res += tickets[k] - 1;
                }
            }
       }
       return res;
    }
}