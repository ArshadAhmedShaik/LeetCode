class Solution {
    public int hammingWeight(int n) {
        int bit = 1;
        int count = 0;
        while(bit!=0) {
            if((n&bit)!=0) count++;
            bit = bit << 1;
        }
        return count;
    }
}