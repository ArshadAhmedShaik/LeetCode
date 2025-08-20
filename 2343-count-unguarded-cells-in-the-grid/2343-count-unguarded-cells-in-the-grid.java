class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
                int[][] arr = new int[m][n];
                for(int k = 0;k < walls.length;k++) {
                        int i = walls[k][0];
                        int j = walls[k][1];
                        arr[i][j] = 5; 
                }
                for(int k = 0;k < guards.length;k++) {
                        int i = guards[k][0];
                        int j = guards[k][1];
                        arr[i][j] = 10;
                }
                for(int k = 0;k < guards.length;k++) {
                        int i = guards[k][0];
                        int j = guards[k][1];
                        // north direction:
                        for(int l = i-1;l >= 0;l--) {
                                if(arr[l][j]!=5 && arr[l][j]!=10) {
                                    arr[l][j] = 1;
                                } else {
                                     break;   
                                }
                        }
                        // south direction:
                        for(int l = i+1;l < m;l++) {
                                if(arr[l][j]!=5 && arr[l][j]!=10) {
                                    arr[l][j] = 1;
                                }
                                    else {
                                    break;
                                }
                        }
                        // east direction:
                        for(int l = j+1;l < n;l++) {
                                if(arr[i][l]!=5 && arr[i][l]!=10) {
                                    arr[i][l] = 1;
                                } else {
                                    break;
                                }
                        }
                        // west direction:
                        for(int l = j-1;l >= 0;l--) {
                                if(arr[i][l]!=5 && arr[i][l]!=10) {
                                    arr[i][l] = 1;
                                } else {
                                    break;
                                }
                        }
                }

                // calculate total ungaurded cells:
                int count = 0;
                for(int[] x: arr) {
                    for(int y: x) {
                            if(y==0) {
                                count++;
                            }
                    }
                }
        return count;        
    }
}