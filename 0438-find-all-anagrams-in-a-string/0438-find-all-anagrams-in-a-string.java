class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int n = s.length();
        int m = p.length();

        List<Integer> list = new ArrayList<>();

        if (n < m)
            return list;

        int[] count = new int[26];
        for (char ch : p.toCharArray())
            count[ch - 'a']++;

        int[] compare = new int[26];
        int start = 0;
        int end = m - 1;

        for (int i = start; i <= end; i++) {
            compare[s.charAt(i) - 'a']++;
        }


        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] != compare[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            list.add(start);

        start = start + 1;
        end = end + 1;

        while (end < n) {
            compare[s.charAt(start - 1) - 'a']--;
            compare[s.charAt(end) - 'a']++;
            isAnagram = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] != compare[i]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram)
                list.add(start);
            start++;
            end++;
        }

        return list;

    }
}