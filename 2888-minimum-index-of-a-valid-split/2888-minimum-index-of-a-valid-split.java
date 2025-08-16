class Solution {
    public int minimumIndex(List<Integer> nums) {

        int n = nums.size();
        int half = n / 2;

       int majority = -1;
       int count = 0;

       for(int x: nums) {
            if(x==majority) {
                count++;
            } else if(count == 0) {
                majority = x;
            } else {
                count--;
            }
       }

       int dominant = majority;

      
        int[] prefix = new int[n];
        count = 0;

        for (int i = 0; i < n; i++) {
            if (nums.get(i) == dominant) count++;
            prefix[i] = count;
        }

        int total = prefix[n - 1]; 

       
        for (int i = 0; i < n - 1; i++) {

            int leftCount = prefix[i];
            int leftLen = i + 1;

            int rightCount = total - prefix[i];
            int rightLen = n - leftLen;

            if (leftCount > leftLen / 2 && rightCount > rightLen / 2) {
                return i;
            }
        }

        return -1;
    }
}
