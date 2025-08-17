import java.util.*;

class RandomizedSet {
    private Set<Integer> set;
    private Random rand;
    private List<Integer> list;

    public RandomizedSet() {
        set = new HashSet<>();
        rand = new Random();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(!set.contains(val)) list.add(val); 
        return set.add(val);
    }

    public boolean remove(int val) {
        if(set.contains(val)) list.remove(Integer.valueOf(val));
        return set.remove(val);
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
