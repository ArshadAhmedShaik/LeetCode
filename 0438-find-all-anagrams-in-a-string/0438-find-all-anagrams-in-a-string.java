class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = p.length();
        int m = s.length();
        for(int i = 0;i <= m - n;i++) {
            String sub = s.substring(i, i+n);
            int[] count = new int[26];
            for(int j = 0;j < n;j++) {
                    count[sub.charAt(j)-'a']++;
                    count[p.charAt(j)-'a']--;
            }
            boolean isAnagram = true;
            for(int x: count) {
                if(x!=0) {
                    isAnagram = false;
                    break;
                }
            }

            if(isAnagram) {
                ans.add(i);
            }

        }
        return ans;
    }
}