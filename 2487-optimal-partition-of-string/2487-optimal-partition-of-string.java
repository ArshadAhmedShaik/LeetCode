class Solution {
    public int partitionString(String s) {
            
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int count = 0;
        for(int i = 0;i < n;i++) {
                char ch = s.charAt(i);
                if(!set.contains(ch)) {
                        set.add(ch);
                } else {
                    count++;
                    set.clear();
                    set.add(ch);
                }
        }         

        return (set.isEmpty()) ? count : count+1;    

    }
}