class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // abcaefaghiab
        int[] firstOccurence = new int[26];
        int[] lastOccurence = new int[26];
        Arrays.fill(firstOccurence, -1);
        Arrays.fill(lastOccurence, -1);
        for(int i = 0;i < s.length();i++) {
                char ch = s.charAt(i);
                if(firstOccurence[ch - 'a']==-1) {
                    firstOccurence[ch - 'a'] = i;
                }
                lastOccurence[ch-'a'] = i;
        }

       

        int max = -1;

        for(int i = 0;i < 26;i++) {
            max = Math.max(lastOccurence[i]-firstOccurence[i]-1, max);
        }
        
        return max;

    }
}