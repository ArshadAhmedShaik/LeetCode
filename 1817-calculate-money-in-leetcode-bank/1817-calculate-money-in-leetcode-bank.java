class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int monday = 1;
        while(n>0) {
            for(int i = 0;i < Math.min(n, 7);i++) {
                    res += (monday + i);
            }
            monday++;
            n -= 7;
        }
        return res;
    }
}