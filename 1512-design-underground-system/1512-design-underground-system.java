class UndergroundSystem {

    class CheckIn {
        String place;
        int time;
        CheckIn(String place, int time) {
            this.place = place;
            this.time = time;
        }
    }

    Map<Integer, CheckIn> map1;
    Map<Integer, int[]> map2;

    public UndergroundSystem() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        map1.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
       
        CheckIn checkIn = map1.remove(id);
        int key = Objects.hash(checkIn.place, stationName);

        map2.putIfAbsent(key, new int[2]);
        map2.get(key)[0] += (t - checkIn.time); 
        map2.get(key)[1] += 1;   

    }

    public double getAverageTime(String startStation, String endStation) {
        int key = Objects.hash(startStation, endStation);
        int[] data = map2.get(key);
        return (double) data[0] / data[1];
    }
}
