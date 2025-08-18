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
    Map<String, TreeSet<Food>> ctof;
    Map<String, Food> foodObj;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        ftor = new HashMap<>();
        ftoc = new HashMap<>();
        ctof = new HashMap<>();
        foodObj = new HashMap<>();

        int n = foods.length;
        for (int i = 0; i < n; i++) {
            ftor.put(foods[i], ratings[i]);
            ftoc.put(foods[i], cuisines[i]);
            Food f = new Food(foods[i], ratings[i]);
            foodObj.put(foods[i], f);

            ctof.computeIfAbsent(cuisines[i], k -> new TreeSet<>(
                (a, b) -> {
                    if (a.rating != b.rating) return b.rating - a.rating;
                    return a.name.compareTo(b.name);
                }
            )).add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = ftoc.get(food);
        Food oldFood = foodObj.get(food);
        ctof.get(cuisine).remove(oldFood);

        Food newFood = new Food(food, newRating);
        foodObj.put(food, newFood);
        ftor.put(food, newRating);
        ctof.get(cuisine).add(newFood);
    }

    public String highestRated(String cuisine) {
        return ctof.get(cuisine).first().name;
    }
}
