class Solution {
    public int minSetSize(int[] arr) {
        // 3 -> 4
        // 5 -> 3
        // 2 -> 2
        // 7 -> 1

        // arr[] = {3,3,3,3,5,5,5,2,2,7} size = 10
        // int count = 0;
        // if we remove 3 -> 4 removed (6 remainaing <= 5)  count++;
        // we remove 5 -> 7 3 remianing <= 5 -> count++;
        // return 2

        int[] count = new int[100001];
        for (int x : arr) {
            count[x]++;
        }

        // count of distinct numbers:

        int countNum = 0;
        for (int x : count) {
            if (x != 0)
                countNum++;
        }

        int[][] matrix = new int[countNum][2];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                matrix[index][0] = i;
                matrix[index][1] = count[i];
                index++;
            }

        }

        Arrays.sort(matrix, (a, b) -> {
            return b[1] - a[1];
        });

        int totalSize = arr.length;
        int halfSize = totalSize / 2;
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][1];
            ans++;
            if (sum >= halfSize) {
                break;
            }

        }

        return ans;

    }
}