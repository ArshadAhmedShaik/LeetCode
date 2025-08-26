class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = s.length();
        if(n < k) return false;

        Set<String> set = new HashSet<>();
        
        int start = 0;
        int end = k - 1;
        while(end<n) {
            set.add(s.substring(start, end+1)); 
            start++;
            end++;
        }
        int length = set.size();
        return length == (int)(Math.pow(2, k));

        // using a bitMask approach:



    }
}