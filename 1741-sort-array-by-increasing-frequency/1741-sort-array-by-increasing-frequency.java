class Solution {

    public int[] frequencySort(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for(var x: nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, (a,b) -> {
            int afreq = map.get(a);
            int bfreq = map.get(b);
           if(afreq==bfreq) {
                return b - a;
           } else {
            return afreq - bfreq;
           }
        }); 

       for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;

    }
}