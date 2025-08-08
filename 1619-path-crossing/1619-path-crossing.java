public class Solution {
    public boolean isPathCrossing(String path) {
        Set<Long> visit = new HashSet<>();
        int x = 0, y = 0;
        visit.add(hash(x, y));

        for (char c : path.toCharArray()) {
            if (c == 'N') y++;
            else if (c == 'S') y--;
            else if (c == 'E') x++;
            else if (c == 'W') x--;

            long pos = hash(x, y);
            if (visit.contains(pos)) return true;
            visit.add(pos);
        }

        return false;
    }

    private long hash(long x, long y) {
        return (x << 32) + y;
    }
}