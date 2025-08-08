class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        set.add("0,0");
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
                String str = x1 + "," + y1;
                if(set.contains(str)) {
                        return true;
                } else {
                    set.add(str);
                }
        }

        return false;

    }
}