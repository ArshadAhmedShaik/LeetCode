class Solution {
    public List<Integer> majorityElement(int[] nums) {
           List<Integer> list = new ArrayList<>();
           int n = nums.length;
           int majority1 = Integer.MIN_VALUE;
           int majority2 = Integer.MIN_VALUE;
           int count1 = 0;
           int count2 = 0;
           for(var x: nums) {
                if(count1 == 0 && x!=majority2) {
                        majority1 = x;
                        count1++;
                } else if(count2 == 0 && x!=majority1) {
                        majority2 = x;
                        count2++;
                } else if(x == majority1) {
                        count1++;
                } else if(x == majority2) {
                        count2++;
                } else {
                        count1--;
                        count2--;
                }
           }
            count1 = 0;
            count2 = 0;
           for(int i = 0;i < n;i++) {
                if(nums[i]==majority1) count1++;
                if(nums[i]==majority2) count2++;
           }

           if(count1>(n/3)) {
                list.add(majority1);
           }

           if(count2>(n/3)) {
                list.add(majority2);
           }

           return list;
    }
}
