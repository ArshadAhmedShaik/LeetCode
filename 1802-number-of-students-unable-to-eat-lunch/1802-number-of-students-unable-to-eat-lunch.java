class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count1 = 0;
        int count0 = 0;
        for (var x : students) {
            if (x == 1)
                count1++;
            else
                count0++;
        }
        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0) {
                if (count0 != 0) {
                    count0--;
                } else {
                    break;
                }
            } else {
                if (count1 != 0) {
                    count1--;
                } else {
                    break;
                }
            }
        }

        return count0 + count1;

    }
}