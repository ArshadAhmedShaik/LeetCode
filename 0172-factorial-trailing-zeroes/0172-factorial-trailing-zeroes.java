class Solution {
    public int trailingZeroes(int n) {
          int sum = 0;
          int i = 5;
          while(true) {
            int rem = n / i;
            i *= 5;
            sum += rem;
            if(rem==0) break;
          }

          return sum;
    }
}