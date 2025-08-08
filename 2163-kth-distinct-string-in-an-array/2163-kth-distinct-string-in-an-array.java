class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                if (--k == 0) return entry.getKey();
            }
        }
        return "";
    }
}
