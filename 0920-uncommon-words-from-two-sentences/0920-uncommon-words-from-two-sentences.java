class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String str : str1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for(String str: str2) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        List<String> list = new ArrayList<>();
        for(var x: map.entrySet()) {
            int count = x.getValue();
            if(count==1) {
                list.add(x.getKey());
            }
        }
        
        return list.toArray(new String[0]);
    }
}