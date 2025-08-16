class Solution {
    public List<Integer> majorityElement(int[] nums) {

      List<Integer> ans = new ArrayList<>();
      Map<Integer, Integer> map = new HashMap<>();
      int count = (nums.length/3) + 1;
      for(var x: nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if(map.get(x)==count) ans.add(x); 
      }

      return ans;
           
    }
}