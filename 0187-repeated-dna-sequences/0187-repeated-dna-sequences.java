class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        if (n < 10) return new ArrayList<>();

        
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1); 
        map.put('G', 2);
        map.put('T', 3); 

        Set<Integer> seen = new HashSet<>();
        Set<String> ans = new HashSet<>();

        int hash = 0;
        int mask = (1 << 20) - 1; 

        for (int i = 0; i < n; i++) {
            
            hash = ((hash << 2) | map.get(s.charAt(i))) & mask;

            if (i >= 9) { 
                if (seen.contains(hash)) {
                    ans.add(s.substring(i - 9, i + 1));
                } else {
                    seen.add(hash);
                }
            }
        }

        return new ArrayList<>(ans);
    }
}
