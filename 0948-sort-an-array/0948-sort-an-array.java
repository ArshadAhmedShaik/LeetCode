class Solution {
    private void merge(int[] nums, int low, int mid, int high) {
            List<Integer> list = new ArrayList<>();
            // merge low->mid and mid+1->high
            int left = low;
            int right = mid+1;
            while(left <= mid && right <= high) {
                    if(nums[left]<=nums[right]) {
                        list.add(nums[left]);
                        left++;
                    } else {
                        list.add(nums[right]);
                        right++;
                    }
            }
            while(left<=mid) {
                list.add(nums[left]);
                left++;
            }
            while(right<=high) {
                list.add(nums[right]);
                right++;
            }
            int j = 0;
            for(int i = low;i <= high;i++) {
                    nums[i] = list.get(j++);
            }
    }
    private void mergeSort(int[] nums,int low,int high) {
                if(low>=high) {
                        return;
                }
                int mid = (low+high)/2;
                mergeSort(nums, low, mid);
                mergeSort(nums, mid+1, high);
                merge(nums, low, mid, high);
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}