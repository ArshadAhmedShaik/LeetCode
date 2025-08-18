class FoodRatings {

     class Food {
        String name;
        int rating;
        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }

    Map<String, Integer> ftor;
    Map<String, String> ftoc;
    Map<String, PriorityQueue<Food>> ctof;

   

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        ftor = new HashMap<>();
        ftoc = new HashMap<>();
        ctof = new HashMap<>();

        int n = foods.length;
        for (int i = 0; i < n; i++) {
            ftor.put(foods[i], ratings[i]);
        }
        for (int i = 0; i < n; i++) {
            ftoc.put(foods[i], cuisines[i]);
        }

        for (var x : ftor.entrySet()) {
            String food = x.getKey();
            int rating = x.getValue();
            String cuisine = ftoc.get(food);

            ctof.computeIfAbsent(cuisine, k -> new PriorityQueue<>(
                    (a, b) -> {
                        if (a.rating < b.rating) {
                            return 1;
                        } else if (a.rating > b.rating) {
                            return -1;
                        } else {
                            // both are equal
                            return a.name.compareTo(b.name);
                        }
                    }));

            ctof.get(cuisine).offer(new Food(food, rating));

        }
    }

    public void changeRating(String food, int newRating) {

        ftor.put(food, newRating);
        ctof.get(ftoc.get(food)).offer(new Food(food, newRating));

    }

    public String highestRated(String cuisine) {

        PriorityQueue<Food> q = ctof.get(cuisine);

        while (!q.isEmpty()) {
            Food top = q.peek();
            if (top.rating == ftor.get(top.name)) {
                return top.name;
            }
            q.poll();
        }
        return "";

    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */