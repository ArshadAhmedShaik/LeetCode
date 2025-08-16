class Solution {
    public List<Integer> majorityElement(int[] nums) {

      List<Integer> list =  new ArrayList<>();
      int majority1 = Integer.MIN_VALUE;
      int majority2 = Integer.MIN_VALUE;
      int count1 = 0;
      int count2 = 0;
      for(int i = 0;i < nums.length;i++) {
            if(count1 == 0 && nums[i]!=majority2) {
                    count1++;
                    majority1 = nums[i];
            } else if(count2 == 0 && nums[i]!=majority1) {
                    count2++;
                    majority2 = nums[i];
            } else if(majority1==nums[i]) {
                    count1++;
            } else if(majority2==nums[i]) {
                    count2++;
            } else {
                   count1--;
                   count2--;
            }
      }

      // manual check

      count1 = 0;
      count2 = 0;

      for(int i = 0;i < nums.length;i++) {
            if(nums[i]==majority1) count1++;
            if(nums[i]==majority2) count2++;
      }

      if(count1>(nums.length/3)) {
            list.add(majority1);
      } 
      if(count2>(nums.length/3)) {
        list.add(majority2);
      }

      return list;
           
    }
}