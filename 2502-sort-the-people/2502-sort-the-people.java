class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
          int n = heights.length;
          Integer[] indices = new Integer[n];
          for(int i = 0;i < n;i++) indices[i] = i;
          Arrays.sort(indices, (a, b) -> {
                      return heights[b] - heights[a];
          });
          String[] str = new String[n];
          for(int i = 0;i < n;i++) {
                str[i] = names[indices[i]];
          }
          return str;
    }
}