class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
          Map<Integer, String> map = new HashMap<>();
          for(int i = 0;i < names.length;i++) {
                map.put(heights[i], names[i]);
          }
          Arrays.sort(heights);
          for(int i = names.length-1;i>=0;i--) {
              names[names.length-i-1] = map.get(heights[i]);
          }
          return names;
    }
}