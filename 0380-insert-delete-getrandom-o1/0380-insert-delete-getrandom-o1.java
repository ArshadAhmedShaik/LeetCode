class RandomizedSet {

    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand;

    public RandomizedSet() {
           map = new HashMap<>();
           list = new ArrayList<>();
            rand = new Random();
    }
    
    public boolean insert(int val) {
             if(map.containsKey(val)) {
                    return false;
             } else {
                    list.add(val);
                    map.put(val, list.size()-1);
                    return true;
             }
    }
    
    public boolean remove(int val) {
              if(!map.containsKey(val)) {
                        return false;
              } else {
                    int index = map.get(val);
                    int last = list.get(list.size()-1);
                    map.put(last ,index);
                    list.set(index, last);
                    list.remove(list.size()-1);
                    map.remove(val);
                    return true;
                    
              }
    }
    
    public int getRandom() {
           int num = rand.nextInt(0, list.size());
           return list.get(num);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */