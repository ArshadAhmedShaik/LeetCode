import java.util.*;

class RandomizedSet {
    private Set<Integer> set;
    private Random rand;

    public RandomizedSet() {
        set = new HashSet<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        return list.get(rand.nextInt(0, list.size()));
    }
}
