class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(var x: arr1) {
            count[x]++;
        }
        int[] sorted = new int[arr1.length];
        int index = 0;
        for(var x: arr2) {
            while(count[x]!=0) {
                sorted[index++] = x;
                count[x]--;
            }
        }
        for(int i = 0;i < count.length;i++) {
            while(count[i]!=0) {
                sorted[index++] = i;
                count[i]--;
            }
        }
        return sorted;
    }
}