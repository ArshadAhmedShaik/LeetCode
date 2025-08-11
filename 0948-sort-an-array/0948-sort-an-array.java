class Solution {
    private int[] temp; // reusable buffer

    private void merge(int[] nums, int low, int mid, int high) {
        int left = low, right = mid + 1, idx = low;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[idx++] = nums[left++];
            } else {
                temp[idx++] = nums[right++];
            }
        }
        while (left <= mid) temp[idx++] = nums[left++];
        while (right <= high) temp[idx++] = nums[right++];

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i];
        }
    }

    private void mergeSort(int[] nums, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public int[] sortArray(int[] nums) {
        temp = new int[nums.length]; // allocate once
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
