class Solution {
    public int compareVersion(String version1, String version2) {
                String[] s1 = version1.split("\\.");
                String[] s2 = version2.split("\\.");
                int n = Math.min(s1.length, s2.length);
                int m = Math.max(s1.length, s2.length);
                for(int i = 0;i < n;i++) {
                        int num1 = Integer.parseInt(s1[i]);
                        int num2 = Integer.parseInt(s2[i]);
                        if(num1 < num2) {
                            return -1;
                        } else if(num1 > num2) {
                            return 1;
                        }
                }

                if(n!=m) {
                    if(m == s1.length) {
                           for(int i = n;i < m;i++) {
                                int num = Integer.parseInt(s1[i]);
                                if(num > 0) {
                                    return 1;
                                } else if(num < 0) {
                                    return -1;
                                }
                           } 
                    } else if (m == s2.length) {
                        for(int i = n;i < m;i++) {
                                int num = Integer.parseInt(s2[i]);
                                if(num > 0) {
                                    return -1;
                                } else if(num < 0) {
                                    return 1;
                                }
                           } 
                    }
                }

             return 0;   

    }
}