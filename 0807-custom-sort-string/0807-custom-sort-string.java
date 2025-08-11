class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        for(char x: s.toCharArray()) {
                count[x-'a']++;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < order.length();i++) {
                while(count[order.charAt(i)-'a']!=0) {
                       str.append(order.charAt(i));
                       count[order.charAt(i)-'a']--;
                }
        }
        for(int i = 0;i < count.length;i++) {
                while(count[i]>0) {
                        str.append((char)(i+'a'));
                        count[i]--;
                }
        }

        return str.toString();
    }
}