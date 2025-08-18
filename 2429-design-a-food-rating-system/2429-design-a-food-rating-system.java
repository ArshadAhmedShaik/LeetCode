public class FoodRatings {
    private Map<String, Integer> foodToRating;
    private Map<String, String> foodToCuisine;
    private Map<String, TreeSet<FoodPair>> cuisineToSortedSet;

    private static class FoodPair {
        int rating;
        String food;

        FoodPair(int rating, String food) {
            this.rating = rating;
            this.food = food;
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToRating = new HashMap<>();
        foodToCuisine = new HashMap<>();
        cuisineToSortedSet = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            foodToRating.put(foods[i], ratings[i]);
            foodToCuisine.put(foods[i], cuisines[i]);
            cuisineToSortedSet.computeIfAbsent(cuisines[i], k -> new TreeSet<>((a, b) -> {
                if (a.rating != b.rating) return b.rating - a.rating;
                return a.food.compareTo(b.food);
            })).add(new FoodPair(ratings[i], foods[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        int oldRating = foodToRating.get(food);
        TreeSet<FoodPair> set = cuisineToSortedSet.get(cuisine);
        set.remove(new FoodPair(oldRating, food));
        foodToRating.put(food, newRating);
        set.add(new FoodPair(newRating, food));
    }

    public String highestRated(String cuisine) {
        return cuisineToSortedSet.get(cuisine).first().food;
    }
}