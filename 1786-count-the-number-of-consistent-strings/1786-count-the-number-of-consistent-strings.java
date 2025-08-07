class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] count = new int[26];
        for(var x: allowed.toCharArray()) {
                count[x-'a']++;
        }
        int num = 0;
        for(int i = 0;i < words.length;i++) {
                char[] word = words[i].toCharArray();
                int[] wordCount = new int[26];
                for(var x: word) {
                        wordCount[x-'a']++;
                }
                boolean isConsistent = true;
                for(int j = 0;j < 26;j++) {
                        if(count[j]==0 && wordCount[j]>0) {
                                isConsistent = false;
                                break;
                        }
                }

                if(isConsistent) num++;
                
        }
        return num;
    }
}