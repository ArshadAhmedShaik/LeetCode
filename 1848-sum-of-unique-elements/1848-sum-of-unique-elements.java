class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for(int x: nums) {
            count[x]++;
        }
        int sum = 0;
        for(int i = 0;i < 101;i++) {
            if(count[i]==1) sum += i; 
        }
        return sum;
    }
}