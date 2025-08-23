class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = p.length();
        int m = s.length();
        int[] count = new int[26];

        for(int i = 0;i < n;i++) {
                count[p.charAt(i)-'a']++;
        }

        for(int i = 0;i <= m - n;i++) {
            String sub = s.substring(i, i+n);
            int[] count2 = new int[26];
            for(int j = 0;j < n;j++) {
                    count2[sub.charAt(j)-'a']++;
            }

            boolean isAnagram = true;
            for(int j = 0;j < 26;j++) {
                if(count[j]!=count2[j]) {
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