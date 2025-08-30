class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        // ratio, count
         long count = 0;  
         Map<Double, Integer> map = new HashMap<>();
         int n = rectangles.length;
         for(int i = 0;i < n;i++) {
                double ratio = (double)rectangles[i][0]/rectangles[i][1];

               
                        count += map.getOrDefault(ratio,0);
              

                map.put(ratio, map.getOrDefault(ratio, 0)+1);

         }
         return count;
    }
}