class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for(var x: students) {
            queue.offer(x);
        }
        int top = 0;
        int rotations = 0;
        while(top <= sandwiches.length  && rotations < queue.size()) {
                if(queue.peek()==sandwiches[top]) {
                    queue.poll();
                    top++;
                    rotations = 0;
                } else {
                    int temp = queue.remove();
                    queue.offer(temp);
                    rotations++;
                }
        }
       return queue.size();
    }
}