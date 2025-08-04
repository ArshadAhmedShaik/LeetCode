class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
          Map<Integer, Integer> map = new TreeMap<>((a, b) -> b - a);
          for(int i = 0;i < heights.length;i++) {
             map.put(heights[i], i);
          }
          String[] res = new String[names.length];
          int index = 0;
          for(var x: map.entrySet()) {
                int ind = x.getValue();
                res[index++] = names[ind];
          }
          
          return res;
    }
}