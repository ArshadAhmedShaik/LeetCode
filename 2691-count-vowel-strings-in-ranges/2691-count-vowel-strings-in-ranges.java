class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] ans = new int[queries.length];
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        boolean[] isVowel = new boolean[n];
        int[] count = new int[n];

        for(int i = 0;i < n;i++) {
            String str = words[i];
            if(set.contains(str.charAt(0)) && set.contains(str.charAt(str.length()-1))) {
                    isVowel[i] = true;
            } else {
                isVowel[i] = false;
            }
        }

        if(isVowel[0]) {
                count[0] = 1;
        } else {
            count[0] = 0; 
        }
       
        for(int i = 1;i < count.length;i++) {
                if(isVowel[i]) {
                       count[i] = count[i-1] + 1; 
                } else {
                    count[i] = count[i-1];
                }
        }

        int index = 0;

        for(int i = 0;i < queries.length;i++) {
                int start = queries[i][0];
                int end = queries[i][1];
                if(start==0) {
                        ans[index++] = count[end];
                } else {
                        ans[index++] = count[end] - count[start-1];
                }
        }

        return ans;

    }
}