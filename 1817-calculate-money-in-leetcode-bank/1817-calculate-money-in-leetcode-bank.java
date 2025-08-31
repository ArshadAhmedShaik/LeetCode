class Solution {
    public int totalMoney(int n) {
    
    // int monday = 0;
    int noOfMondays = (n/7) + (((n%7)>0) ? 1 : 0);
    int count = n;
    int sum = 0;
    for(int i = 1;i <= noOfMondays;i++) {
            sum += i;
            count--;
            for(int j = 2;j <= Math.min(count+1,7);j++) {
                    sum += (i+j-1);
            }
            count -= Math.min(count, 6);
    }

    return sum;

    }
}