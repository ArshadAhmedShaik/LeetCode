class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // abcaefaghiab
        int[] firstOccurence = new int[26];
        // Arrays.fill(firstOccurence, -1);
        int max = -1;
        for(int i = 0;i < s.length();i++) {
                char ch = s.charAt(i);
                if(firstOccurence[ch - 'a']==0) {
                    firstOccurence[ch - 'a'] = i+1;
                }
               max = Math.max(max, i-firstOccurence[ch-'a']);
        }
        
        return max;

    }
}