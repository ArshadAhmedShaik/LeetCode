class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int index = 0;
        for(int i = 0;i < nums1.length;i++) {
            for(int j = 0;j < nums2.length;j++) {
                    if(nums1[i]==nums2[j]) {
                            int nextGreat = -1;
                            for(int k = j + 1;k < nums2.length;k++) {
                                   if(nums2[k]>nums2[j]) {
                                        nextGreat = nums2[k];
                                        break;
                                   }
                            }
                            result[index++] = nextGreat;
                    }
            }
        }
        return result;
    }
}