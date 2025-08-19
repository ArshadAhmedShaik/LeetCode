class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> set = new HashSet<>();
        for(int i = 0;i < arr1.length;i++) {
                String str = String.valueOf(arr1[i]);
                int n = str.length();
                for(int j = 1;j <= n;j++) {
                        set.add(str.substring(0, j));
                }
        }
        int maxLength = 0;
        for(int i = 0;i < arr2.length;i++) {
                String str = String.valueOf(arr2[i]);
                int n = str.length();
                for(int j = 1;j <= n;j++) {
                      String sub = str.substring(0, j);
                      if(set.contains(sub)) {
                            maxLength = Math.max(maxLength, sub.length());
                      }     
                }
        }
        return maxLength;
    }
}