class FoodRatings {

    class Food {
        String name, cuisine;
        int rating;

        Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }

    Map<String, Food> foodObj;
    Map<String, TreeSet<Food>> ctof;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodObj = new HashMap<>();
        ctof = new HashMap<>();

        int n = foods.length;
        for (int i = 0; i < n; i++) {
            Food f = new Food(foods[i], cuisines[i], ratings[i]);
            foodObj.put(foods[i], f);

            ctof.computeIfAbsent(cuisines[i], k -> new TreeSet<>(
                (a, b) -> a.rating != b.rating ? b.rating - a.rating : a.name.compareTo(b.name)
            )).add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        Food f = foodObj.get(food);
        TreeSet<Food> set = ctof.get(f.cuisine);

        set.remove(f);
        f.rating = newRating;  
        set.add(f);
    }

    public String highestRated(String cuisine) {
        return ctof.get(cuisine).first().name;
    }
}
