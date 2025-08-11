class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for(var x: nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
       }
       int[] count = new int[max-min+1];
       int offset = -min;

       for(var x: nums) {
            count[x+offset]++;
       }
       PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
        return count[b+offset] - count[a+offset];
       }); 
       for(int i = 0;i < count.length;i++) {
                if(count[i]!=0) {
                        queue.offer(i-offset);
                }
       }

       int[] res = new int[k];
        int index = 0;
       for(int i = 0;i < k;i++) {
                res[index++] = queue.poll();
       }

       return res;

    }
}