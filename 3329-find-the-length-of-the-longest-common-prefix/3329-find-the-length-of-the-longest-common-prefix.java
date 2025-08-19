class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i < arr1.length;i++) {
                int n = arr1[i];
                while(n>0) {
                   set.add(n);
                   n /= 10;
                }
        }
        int maxLength = 0;
        for(int i = 0;i < arr2.length;i++) {
               int n = arr2[i];
               while(n>0) {
                    if(set.contains(n)) {
                            int length = 0;
                            if(n==0) {
                                length = 1;
                            } else {
                                length = (int)Math.log10(n)+1;
                            }
                            maxLength = Math.max(length, maxLength);
                    }
                    n /= 10;
               }

        }
        return maxLength;
    }
}