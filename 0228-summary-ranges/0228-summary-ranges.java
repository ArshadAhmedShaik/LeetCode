class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        int n = nums.length;
        if (n == 1) {
            list.add("" + nums[0]);
            return list;
        } else if (n == 0) {
            return list;
        }
        int start = 0;
        int move = 1;

        while (move < n) {
            while (move < n && nums[move] == nums[move - 1] + 1) {
                move++;
            }
            if (nums[move - 1] == nums[start]) {
                list.add("" + nums[start]);
            } else {
                list.add(nums[start] + "->" + nums[move - 1]);
            }

            start = move;
            move++;
        }

        if (start < n) {
           
                list.add("" + nums[start]);
      
        }

        return list;
    }
}
