class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int finishTime = 0;
        double totalWait = 0;

        for (int[] c : customers) {
            finishTime = Math.max(finishTime, c[0]) + c[1];
            totalWait += finishTime - c[0];
        }
        
        return totalWait / n;
    }
}
