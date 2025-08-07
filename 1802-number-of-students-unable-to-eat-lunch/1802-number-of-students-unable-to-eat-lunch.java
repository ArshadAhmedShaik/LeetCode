class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for(var x: students) {
            queue.offer(x);
        }
        for(int i = sandwiches.length-1;i>=0;i--) {
            stack.push(sandwiches[i]);
        }
        int rotations = 0;
        while(!stack.isEmpty() && rotations < queue.size()) {
                if(queue.peek()==stack.peek()) {
                    queue.poll();
                    stack.pop();
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