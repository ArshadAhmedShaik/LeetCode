class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for(int i = 0;i < haystack.length();i++) {
                int start = i;
                int end = i + n - 1;
                if(end <= haystack.length() - 1 && haystack.substring(start, end+1).equals(needle)) {
                    return start;
                } 
        }
        return -1;
    }
}