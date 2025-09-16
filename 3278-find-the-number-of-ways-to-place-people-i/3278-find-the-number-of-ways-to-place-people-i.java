class Solution {
    public int numberOfPairs(int[][] points) {
       Arrays.sort(points, (a, b) -> {
             if(a[0]!=b[0]) return a[0] - b[0];
             else {
                return b[1] - a[1];
             }
       });
      int n = points.length;  
      int count = 0;
      for(int i = 0;i < n;i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int maxY = Integer.MIN_VALUE;
            for(int j = i + 1;j < n;j++) {

                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    if(y2>y1) {
                        continue;
                    } else {
                        if(maxY<y2) {
                                count++;
                        }
                    }
                    maxY = Math.max(maxY, y2);    
            }
      }

      return count;

    }
}