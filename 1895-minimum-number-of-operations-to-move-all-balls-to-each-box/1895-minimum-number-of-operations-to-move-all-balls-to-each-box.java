class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        char[] box = boxes.toCharArray();
        int[] ans = new int[n];
        for(int i = 0;i < n;i++) {
            int sum = 0;
            for(int j = 0;j < n;j++) {
                if(i!=j) {
                    if(box[j]=='1') {
                        sum += Math.abs(i-j);
                    }
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}