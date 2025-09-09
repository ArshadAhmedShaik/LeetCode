class Solution {
    public int[] sumZero(int n) {
        // if(n==2) return new int[] {1, -1};
        int sum = 0;
        int[] arr = new int[n];
        int index = 0;
        for(int i = 1;i < n;i++) {
                arr[index++] = i;
                sum += i;
        }  
        arr[index] = -sum;
        return arr;
    }
}