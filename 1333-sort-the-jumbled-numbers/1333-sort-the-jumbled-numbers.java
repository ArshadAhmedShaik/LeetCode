import java.math.*;
class Solution {
   private String mappedNumber(int n, int[] mapping) {
    if(n == 0) return String.valueOf(mapping[0]);
    StringBuilder sb = new StringBuilder();
    while(n > 0) {
        int digit = n % 10;
        sb.append(mapping[digit]);
        n /= 10;
    }
    return sb.reverse().toString(); 
}
    public int[] sortJumbled(int[] mapping, int[] nums) {

    Integer[] ans = new Integer[nums.length];
    for(int i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
    }

    Arrays.sort(ans, (a, b) -> {
        String num1 = mappedNumber(a, mapping);
       String num2 = mappedNumber(b, mapping);
      return new BigInteger(num1).compareTo(new BigInteger(num2));
    });

    int[] res = new int[ans.length];
    for(int i = 0; i < ans.length; i++) res[i] = ans[i];

    return res;
}

}