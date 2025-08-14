class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int x: nums) {
        set.add(x);
       }
       int longest = 0;
       int count = 0;
       for(int x: set) {
            if(!set.contains(x-1)) {
                count = 1;
                while(set.contains(x+count)) {
                        count++;
                }
            }
                longest = Math.max(count, longest);
       }

       return longest;
    }
}
