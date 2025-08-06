class Solution {
    public List<String> commonChars(String[] words) {
       
      int[] count = new int[26];
      Arrays.fill(count, Integer.MAX_VALUE);

      for(int i = 0;i < words.length;i++) {
                int[] curCount = new int[26];
                for(int j = 0;j < words[i].length();j++) {
                        curCount[words[i].charAt(j)-'a']++;
                }
                for(int j = 0;j < 26;j++) {
                        count[j] = Math.min(count[j], curCount[j]);
                }
      }

      List<String> list = new ArrayList<>();
      for(int i = 0;i < 26;i++) {
            while(count[i]!=0) {
            list.add(String.valueOf((char)(i + 'a')));
            count[i]--;
            }
      }
      return list;

    }
}