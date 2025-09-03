class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] way = new int[1001];

        for(int i=0;i<trips.length;i++){
            int c=trips[i][0];
            int s=trips[i][1];
            int e=trips[i][2];
            way[s]+=c;
            way[e]-=c;
        }
        int[] pre = new int[1001];
        pre[0]=way[0];
        if(pre[0]>capacity) return false;
        for(int i=1;i<1001;i++){
            pre[i]=pre[i-1]+way[i];
            if(pre[i]>capacity) return false;
        }
        return true;
    }
}