class Solution {
    public double averageWaitingTime(int[][] customers) {
        int curr=0;
        long total=0;
        int m = customers.length;
        for(int [] n :customers){

            int at = n[0];
            int tt = n[1];
           if(curr<at)curr=at;
           
            int f = curr+tt;
            int wt = f-at;
            curr=f;
            total+=wt;
            

        }
        return (double)total/m;
    }
}