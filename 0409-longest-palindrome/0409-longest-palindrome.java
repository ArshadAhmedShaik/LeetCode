class Solution {
    public int longestPalindrome(String s) {
       Map<Character, Integer> map = new HashMap<>();
       int res = 0;
       for(var x: s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if(map.get(x)%2==0) {
                res += 2;
            }
       }
       for(var x: map.entrySet()) {
            if(x.getValue()%2!=0) {
                res++;
                break;
            }
       }
       return res;
    }
}