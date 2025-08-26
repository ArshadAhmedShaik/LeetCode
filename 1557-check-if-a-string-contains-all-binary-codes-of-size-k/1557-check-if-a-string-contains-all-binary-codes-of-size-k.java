class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        int n = s.length();
        int start = 0;
        int end = k - 1;
        while(end<n) {
            set.add(s.substring(start, end+1)); 
            start++;
            end++;
        }
        int length = set.size();
        return length == Math.pow(2, k);
    }
}