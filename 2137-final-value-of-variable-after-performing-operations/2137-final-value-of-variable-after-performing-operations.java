class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(int i=0;i<operations.length;i++){
            char c = operations[i].charAt(1);
            if(c == '+') sum++;
            else sum--;
        }
        return sum;
    }
}