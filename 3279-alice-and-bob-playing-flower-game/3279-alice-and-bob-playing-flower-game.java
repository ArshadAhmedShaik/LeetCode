import java.math.*;

class Solution {
    public long flowerGame(int n, int m) {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger M = BigInteger.valueOf(m);
        
        BigInteger product = N.multiply(M);      
        BigInteger result = product.divide(BigInteger.valueOf(2)); 
        
        return result.longValue(); 
    }
}
