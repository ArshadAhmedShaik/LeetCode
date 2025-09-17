class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for(int x : arr) {
            count[x]++;
        } 
        for(int i = 500;i >= 0;i--) {
            if(count[i]!=0 && count[i]==i) return i;
        }
        return -1;
    }
}