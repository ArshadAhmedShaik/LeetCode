class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
     
        int[] temp = new int[26];
        for(String str: words2) {
                int[] count = new int[26];
                for(char ch: str.toCharArray()) {
                        count[ch-'a']++;
                }
                for(int i = 0;i < temp.length;i++) {
                        if(temp[i]<count[i]) {
                            temp[i] = count[i];
                        } 
                }
        }
        for(String str: words1) {
                boolean isUniversal = true;
                int[] count2 = new int[26];
                for(char ch: str.toCharArray()) {
                        count2[ch-'a']++;
                }
                for(int i = 0;i < count2.length;i++) {
                        if(count2[i]<temp[i]) {
                                isUniversal = false;
                                break;
                        }
                }
                if(isUniversal){
                    ans.add(str);
                }
        }

        return ans;
    }
}