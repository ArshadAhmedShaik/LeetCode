class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        int negatives = 0;
        for(var x: nums) {
            if(x==0) return 0;
            else if(x<0) negatives++;
        }
        if(negatives%2==0) {
            return 1;
        } 
        return -1;
    }
}