class Solution {
    public int numberOfPairs(int[][] points) {
       Arrays.sort(points, (a, b) -> {
             if(a[0]!=b[0]) return b[0] - a[0];
             else {
                return a[1] - b[1];
             }
       });
      int n = points.length;  
      int count = 0;
      for(int i = 0;i < n;i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int minY = Integer.MAX_VALUE;
            for(int j = i + 1;j < n;j++) {

                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    if(y2<y1) {
                        continue;
                    } else {
                        if(minY>y2) {
                                count++;
                        }
                    }
                    minY = Math.min(minY, y2);    
            }
      }

      return count;

    }
}