class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for(char x: text.toCharArray()) {
                count[x-'a']++;
        }
     
     /*bottle-neck question*/

        int b = count[1];
        int a = count[0];
        int l = count['l'-'a']/2;
        int o = count['o'-'a']/2;
        int n = count['n'-'a'];

        return Math.min(Math.min(Math.min(b, a),Math.min(l,o)),n);


    }
}