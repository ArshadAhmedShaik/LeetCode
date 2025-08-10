class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        long ft = 0;
        long sum = 0;
        for(int i = 0;i < n;i++) {
                long at = (long)customers[i][0];
                long bt = (long)customers[i][1];
                if(at>ft) {
                    ft = at + bt;
                } else {
                    ft = ft + bt;
                }

                sum += (ft-at);
            
        }

        return (double)sum/n;
      

    }
}