class Solution {
    public int partitionString(String s) {
            
          int count = 1;
          int mask = 0;
          int n = s.length();
          for(int i = 0;i < n;i++) {
                char ch = s.charAt(i);
                // if it is absent
                int k = 1 << (ch-'a');
                if((mask&k) == 0) {
                    mask |= k;
                } else { // if it is present
                        count++;
                        mask = k;
                }
          }  
        return count;
    }
}