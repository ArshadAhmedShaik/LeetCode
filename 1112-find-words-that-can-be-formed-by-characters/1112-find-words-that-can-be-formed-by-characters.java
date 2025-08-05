class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for(var x: words) {
                boolean isGood = true;
                int[] count = new int[26];
                for(int i = 0;i < x.length();i++) {
                        count[x.charAt(i)-'a']++;
                }
                for(int i = 0;i < chars.length();i++) {
                        count[chars.charAt(i)-'a']--;
                }
                for(var y: count) {
                    if(y>0) {
                        isGood = false;
                    }
                }
                if(isGood) sum += x.length();
        }
        return sum;
    }
}