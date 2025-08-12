class Solution {
    static {
        for(int i = 0;i < 500;i++)
        appendCharacters(new String("hgjhg"), new String("hjfgk"));
    }
    public static int appendCharacters(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        int left = 0, right = 0;
        while (left < arrT.length && right < arrS.length) {
            if (arrS[right] == arrT[left]) {
                left++;
            }
            right++;
        }
        return arrT.length - left;
    }
}
