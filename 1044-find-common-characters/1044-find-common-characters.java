class Solution {
    public List<String> commonChars(String[] words) {
       
         String first = words[0];
         Map<Character, Integer> map = new HashMap<>();

         for(int i = 0;i < first.length();i++) {
                map.put(first.charAt(i), map.getOrDefault(first.charAt(i), 0)+1);
         }

         for(int i = 1;i < words.length;i++) {
                String word = words[i];
                Map<Character, Integer> temp = new HashMap<>();
                
         for(int j = 0;j < word.length();j++) {
                temp.put(word.charAt(j), temp.getOrDefault(word.charAt(j), 0)+1);
         }
         Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
                while(it.hasNext()) {
                        Map.Entry<Character, Integer> x = it.next();
                        char ch = x.getKey();
                        int freq = x.getValue();
                        if(temp.containsKey(ch)) {
                                map.put(ch, Math.min(map.get(ch),temp.get(ch)));
                        } else {
                            it.remove();
                        }
                }

         }
        List<String> list = new ArrayList<>();

         for(var x: map.entrySet()) {
                char ch = x.getKey();
                int freq = x.getValue();
                while(freq!=0) {
                        list.add(String.valueOf(ch));
                        freq--;
                }
         }

         return list;

    }
}