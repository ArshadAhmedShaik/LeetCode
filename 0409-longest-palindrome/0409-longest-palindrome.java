class Solution {
    public int longestPalindrome(String s) {
         Set<Character> seen = new HashSet<>();
         int res = 0; 
         for(var x: s.toCharArray()) {
                if(seen.contains(x)) {
                    seen.remove(x);
                    res += 2;
                } else {
                    seen.add(x);
                }
         }
         if(!seen.isEmpty()) res++;
         return res; 
    }
}