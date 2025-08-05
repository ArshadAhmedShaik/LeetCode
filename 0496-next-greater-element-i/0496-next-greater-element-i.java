class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;

        int[] temp = new int[nums2.length];

        for(int i = 0;i < nums2.length;i++) {
                int nextGreat = -1;
                for(int j = i+1;j < nums2.length;j++) {   
                        if(nums2[j]>nums2[i]){
                                nextGreat = nums2[j];
                                break;
                        }
                } 
                temp[i] = nextGreat;
        }

        int[] ans = new int[nums1.length];
        int index = 0;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < nums2.length;j++) {
                    if(nums1[i]==nums2[j]) {
                        
                        ans[index++] = temp[j];

                    }
            }
        }
        return ans;
    }
}