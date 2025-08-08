class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for(var str: words) {
                for(var ch: str.toCharArray()) {
                        count[ch-'a']++;
                }
        }

        for(var x: count) {
                if(x!=0 && x%words.length!=0) return false;
        }

        return true;

    }
}