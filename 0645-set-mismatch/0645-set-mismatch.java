class Solution {
    public int[] findErrorNums(int[] nums) {
        int n =nums.length;
        Set<Integer> set = new HashSet<>();
        int duplicate = -1;
        for(var x: nums) {
            if(!set.add(x)) {
                duplicate = x;
            }
        }
        int sum = 0;
        for(var x: set) {
                sum += x;
        }
        int missing = (n*(n+1))/2 - sum;
        return new int[] {duplicate, missing};
    }
}