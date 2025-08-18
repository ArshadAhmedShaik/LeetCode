class Solution {
    
    public static int subarraysDivByK(int[] nums, int k) {
       
       int[] map = new int[k];
       map[0] = 1;
       int count = 0;
       int sum = 0;
       for(int x: nums) {
            sum += x;
            int rem = (sum % k);
            if(rem<0) rem += k;
            if(map[rem]!=0) {
                count += map[rem];
            }
            map[rem]++;
       }


       return count;

    }
}
