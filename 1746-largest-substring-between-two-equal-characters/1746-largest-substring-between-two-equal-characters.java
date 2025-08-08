class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int max = -1;
        for(int i = 0;i < n;i++) {
                char ch = s.charAt(i);
                if(set.contains(ch)) continue;
                set.add(ch);
                int index = -1;
                for(int j = i + 1;j < n;j++) {
                        if(ch==s.charAt(j)) {
                            index = j;
                        }
                }
                if(index!=-1) {
                max = Math.max(max, index-i-1);
                }

        }
        return max;
    }
}