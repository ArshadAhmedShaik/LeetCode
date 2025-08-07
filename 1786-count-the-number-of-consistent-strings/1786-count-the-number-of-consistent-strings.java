class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int bitMask = 0;
        for(var x: allowed.toCharArray()) {
                int temp = 1;
                int shift = x - 'a';
                temp = temp<<shift;
                bitMask = bitMask|temp;
        }
        int count = 0;
        for(var x: words) {
            boolean isConsistent = true;
            for(var ch: x.toCharArray()) {
                    int temp = 1;
                    int shift = ch - 'a';
                    temp = temp<<shift;
                    if((temp&bitMask)==0) {
                        isConsistent = false;
                        break;
                    }  
            }
            if(isConsistent) count++;
        }
        return count;
    }
}