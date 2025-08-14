class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        for(var x: nums) {
            set.add(x);
        }
        int longest = 0;
        int count = 0;
        for(var x: set) {
            if(!set.contains(x-1)) {
                    count = 1;
                    while(set.contains(x+count)) {
                            count++;
                           
                           }
            }
             longest = Math.max(longest , count);
             
        }
        return longest;
    }
}
