class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        int index = 0;

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < nums2.length;j++) {
                    if(nums1[i]==nums2[j]) {
                        // find the next greatest element 
                        int greaterElement = -1;
                            for(int k = j+1;k < nums2.length;k++) {
                                    if(nums2[k]>nums2[j])  {
                                        greaterElement = nums2[k];
                                        break;
                                    }
                            }

                            ans[index++] = greaterElement;

                    }
            }
        }
        return ans;
    }
}