class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String str: arr) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        int distincts = 0;
        for(var x: map.entrySet()) {
            String str = x.getKey();
            int count = x.getValue();
            if(count==1) {
                distincts++;
                if(distincts==k) return str;
            }
        }
        return "";
    }
}