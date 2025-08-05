class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums1.length;i++) {
                map.put(nums1[i], i);
        }
        int[] result = new int[nums1.length];
        for(int i = 0;i < nums2.length;i++) {
                if(map.containsKey(nums2[i])) {
                        int nextGreat = -1;
                        for(int j = i + 1;j < nums2.length;j++) {
                                if(nums2[j]>nums2[i]) {
                                    nextGreat = nums2[j];
                                    break;
                                }
                        }
                        result[map.get(nums2[i])] = nextGreat;
                }
        }
        return result;
    }
}