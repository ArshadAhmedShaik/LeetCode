class Solution {
    public int longestPalindrome(String s) {
         Set<Character> set = new HashSet<>();
         int res = 0;
         for(var x: s.toCharArray()) {
                if(set.contains(x)) {
                    set.remove(x);
                    res += 2;
                } else {
                    set.add(x);
                }
         }
         if(!set.isEmpty()) {
            res++;
         }
         return res;
    }
}