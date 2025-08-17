import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        Integer index = map.get(val);
        if (index == null) {
            return false;
        }

        int lastIndex = list.size() - 1;
        int lastVal = list.get(lastIndex);

        if (index != lastIndex) { 
            list.set(index, lastVal);
            map.put(lastVal, index);
        }

        list.remove(lastIndex);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }
}
