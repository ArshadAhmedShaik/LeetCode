class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
           int n = s.length();
           Set<String> ans = new HashSet<>();
           Set<String> set = new HashSet<>();
           if(n<10) {
               return new ArrayList<>();
           }
           int start = 0;
           int end = 9;
           while(end<n) {
                String sub = s.substring(start, end+1);
                if(set.contains(sub)) {
                    ans.add(sub);
                } else {
                    set.add(sub);
                }
                start++;
                end++;
           }


           return new ArrayList<>(ans);
    }
}