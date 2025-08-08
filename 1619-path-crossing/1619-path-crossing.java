class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> set = new HashSet<>();
        set.add(0);
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
                int str = x1 * 100000 + y1;
                if(set.contains(str)) {
                        return true;
                } else {
                    set.add(str);
                }
        }

        return false;

    }
}