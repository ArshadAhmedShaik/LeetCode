class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int ft = 0;
        double sum = 0;
        for(int i = 0;i < n;i++) {
                int at = customers[i][0];
                int bt = customers[i][1];
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