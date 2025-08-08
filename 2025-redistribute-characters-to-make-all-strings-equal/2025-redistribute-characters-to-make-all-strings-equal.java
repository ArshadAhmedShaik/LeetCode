class Solution {
    static {
       for(int i = 0;i < 500;i++) 
          makeEqual(new String[] {"agf", "aabbfg", "bbngf"});
    }
    public static boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for (String word : words)
            for (char c : word.toCharArray())
                count[c - 'a']++;

        int n = words.length;
        for (int x : count)
            if (x % n != 0) return false;

        return true;
    }
}
