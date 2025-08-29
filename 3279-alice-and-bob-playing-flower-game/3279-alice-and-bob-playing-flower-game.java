class Solution {
    // if x + y is odd then x -> even && y -> odd or else reverse
    // only two possibilites are there
    public long flowerGame(int n, int m) {
        return ( (long)((n + 1)/2) * (m/2) ) + ((long)(n/2) * ((m + 1)/2));
    }
}
