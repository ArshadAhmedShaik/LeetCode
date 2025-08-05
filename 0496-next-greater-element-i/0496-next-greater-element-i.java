class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        int index = 0;

        Stack<Integer> stack = new Stack<>();

        int[] nextGreater = new int[nums2.length];

        for(int i = nums2.length-1;i>=0;i--) {
                
                while(!stack.isEmpty()) {
                        if(stack.peek()<=nums2[i]) {
                                stack.pop();
                        } else {
                                nextGreater[i] = stack.peek();
                                stack.push(nums2[i]);
                                break;
                        }
                }
                if(stack.isEmpty()) {
                    nextGreater[i] = -1;
                }
                stack.push(nums2[i]);
        }

        for(int i = 0;i < n;i++) {
            for(int j = 0;j < nums2.length;j++) {
                    if(nums1[i]==nums2[j]) {
                        
                               ans[index++] = nextGreater[j]; 

                    }
            }
        }
        return ans;
    }
}