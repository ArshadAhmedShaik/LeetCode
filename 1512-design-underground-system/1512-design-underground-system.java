class UndergroundSystem {

    // id -> checkIn time -> starting place
    // 89 -> (56, hyd)
    // 89 -> 60 -> bang
    // (starting Place, Ending place) -> totalTime
    // if map1.get(id).place = hyd
    // (hyd, bang) -> 

    class CheckIn {
        String place;
        int time;
        CheckIn(String place, int time) {
                this.place = place;
                this.time = time;
        }
    }

    Map<Integer, CheckIn> map1;
    Map<String, int[]> map2;

    public UndergroundSystem() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
           map1.put(id, new CheckIn(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
         String obj = map1.get(id).place +"|"+ stationName;
         map2.putIfAbsent(obj, new int[2]);
         map2.get(obj)[0] += (t - map1.get(id).time); 
         map2.get(obj)[1] += 1;                      

    }
    
    public double getAverageTime(String startStation, String endStation) {
             return (double)map2.get(startStation+"|"+endStation)[0]/map2.get(startStation+"|"+endStation)[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */