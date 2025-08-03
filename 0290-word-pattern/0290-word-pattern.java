class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        
        String[] string = s.split(" ");

        if(string.length!=pattern.length()) return false;
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = string[i];

            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(str)) return false;
            } else {
                    if(map1.containsKey(str)) {
                        return false;
                    } else {
                        map.put(ch, str);
                        map1.put(str, ch);
                    }
            }

        }
        return true;
    }
}