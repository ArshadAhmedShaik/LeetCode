class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        for(int i = 0;i < haystack.length();i++) {
                int start = i;
                int end = i + n - 1;
                if(end<=haystack.length()-1) {
                        int index = 0;
                        boolean isSame = true;
                for(int j = start;j <= end;j++) {
                        
                        if(haystack.charAt(j)!=needle.charAt(index++)) {
                            isSame = false;
                                break;
                        }
                }

                if(isSame) {
                    return start;
                }

                }
        }
        return -1;
    }
}