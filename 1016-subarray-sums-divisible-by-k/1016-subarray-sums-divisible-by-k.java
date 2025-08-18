class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       int[] map = new int[k];
       map[0] = 1;
       int count = 0;
       int sum = 0;
       for(int x: nums) {
            sum+=x;
            int rem = ((sum % k) + k)%k;
            if(map[rem]!=0) {
                count += map[rem];
            }
            map[rem] += 1;
       }

       return count;
    }
}
