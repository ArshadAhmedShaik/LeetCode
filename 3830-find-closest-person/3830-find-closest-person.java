class Solution {
    public int findClosest(int x, int y, int z) {
        int firstDiff = Math.abs(x-z);
        int secondDiff = Math.abs(y-z);

        if(firstDiff < secondDiff) {
                return 1;
        } else if(firstDiff > secondDiff) {
                return 2;
        } 

        return 0;
    }
}