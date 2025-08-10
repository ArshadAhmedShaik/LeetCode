class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[][] result = new int[nums1.length+nums2.length][2];
        while(left<nums1.length&&right<nums2.length) {
                if(nums1[left][0]<nums2[right][0]) {
                        result[index][0] = nums1[left][0];
                        result[index][1] = nums1[left][1];
                        index++;
                        left++;
                } else if(nums1[left][0]>nums2[right][0]) {
                        result[index][0] = nums2[right][0];
                        result[index][1] = nums2[right][1];
                        index++;
                        right++;
                } else {
                    result[index][0] = nums1[left][0];
                    result[index][1] = nums1[left][1] + nums2[right][1];
                    index++;
                    left++;
                    right++;
                }
        }
        while(left<nums1.length) {
                result[index][0] = nums1[left][0];
                result[index][1] = nums1[left][1];
                        index++;
                left++;
        }
        while(right<nums2.length) {
                result[index][0] = nums2[right][0];
                result[index][1] = nums2[right][1];
                index++;
                right++;
        }
        return Arrays.copyOf(result, index);
    }
}