class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = points[i][0];
            int y = points[i][1];
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int xComp = points[j][0];
                    int yComp = points[j][1];
                    if (xComp <= x && yComp >= y) {
                        boolean isContains = false;
                        for (int k = 0; k < n; k++) {
                            int x1 = points[k][0];
                            int y1 = points[k][1];
                            if (k != j && k != i) {
                                if (x1 <= x && y1 >= y && y1 <= yComp && x1 >= xComp) {
                                    isContains = true;
                                    break;

                                }
                            }
                        }
                        if(!isContains) count++;
                    }
                }
            }
        }
        return count;
    }
}