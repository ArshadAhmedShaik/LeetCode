class Solution {
    public boolean divideArray(int[] nums) {
        // int[] count = new int[501];
        // for(var x: nums) {
        //     count[x]++;
        // }
        // for(var x: count) {
        //     if(x!=0) {
        //         if(x%2!=0) return false;
        //     }
        // }
        // return true;
        Set<Integer> set = new HashSet<>();
        for(var x: nums) {
            if(set.contains(x)) set.remove(x);
            else set.add(x);
        }
        return set.isEmpty();
    }
}