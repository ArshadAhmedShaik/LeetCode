class Solution {
    class Pair {
        int tickets;
        int index;
        Pair(int tickets, int index) {
                this.tickets = tickets;
                this.index = index;
        } 
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
            Queue<Pair> queue = new LinkedList<>();
            for(int i = 0;i < tickets.length;i++) {
                    queue.offer(new Pair(tickets[i], i));
            }
            int time = 0;
            while(!queue.isEmpty()) {
                   Pair p = queue.poll();
                   p.tickets--;
                   time++;
                   if(p.tickets>0) {
                        queue.offer(p);
                   } else if (p.tickets == 0) {
                        if(p.index == k) return time;
                   }
            }
            return time;
    }
}