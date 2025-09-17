class FoodRatings {
    Map<String, Integer> foodToRatings = new HashMap<>();
    Map<String, String> foodToCuisine = new HashMap<>();
    Map<String, TreeSet<String>> cuisineToFoods = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n = foods.length;
        for (int i = 0; i < n; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToRatings.put(food, rating);
            foodToCuisine.put(food, cuisine);

            cuisineToFoods.putIfAbsent(cuisine,
                new TreeSet<>((a, b) -> {
                    int cmp = Integer.compare(foodToRatings.get(b), foodToRatings.get(a)); 
                    if (cmp == 0) return a.compareTo(b); 
                    return cmp;
                })
            );

            cuisineToFoods.get(cuisine).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        TreeSet<String> set = cuisineToFoods.get(cuisine);

      
        set.remove(food);
        foodToRatings.put(food, newRating);
        set.add(food);
    }

    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first();
    }
}
