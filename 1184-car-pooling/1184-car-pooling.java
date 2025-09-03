class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
                int[] capacityAtEachLocation = new int[1001];
                for(int[] x: trips) {
                        int startLocation = x[1];
                        int endLocation = x[2];
                        int noOfCustomers = x[0];
                        capacityAtEachLocation[startLocation] += noOfCustomers;
                        capacityAtEachLocation[endLocation] -= noOfCustomers;
                }

       for (int i = 0; i < 1001; i++) {
    if (i != 0) {
        capacityAtEachLocation[i] += capacityAtEachLocation[i - 1];
    }
    if (capacityAtEachLocation[i] > capacity) {
        return false;
    }
}

        return true;

    }
}