class Solution {
    public boolean isPathCrossing(String path) {
        Set<Long> set = new HashSet<>();
        set.add(encode(0,0));
        int x1 = 0;
        int y1 = 0;
        for(var ch: path.toCharArray()) {
                if(ch == 'N') {
                       y1++; 
                } else if(ch == 'W') {
                        x1--;
                } else if(ch == 'E') {
                       x1++;
                } else {
                        y1--;
                }
                long str = encode(x1,y1);
                if(set.contains(str)) {
                        return true;
                } else {
                    set.add(str);
                }
        }

        return false;

    }

    private long encode(int x, int y) {
        return (((long) x) << 32) ^ (y & 0xffffffffL);
    }
}