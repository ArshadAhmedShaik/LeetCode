class Solution {
    public int[] sortArray(int[] nums) {
        
        Thread sortThread = new Thread(() -> Arrays.sort(nums));//Dual-Pivot QuickSort
        sortThread.start();
        try{
            sortThread.join();

        }
        catch(Exception e){
        }
        return nums;
    }
}