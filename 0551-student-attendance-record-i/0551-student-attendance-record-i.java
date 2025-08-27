class Solution {
    public boolean checkRecord(String s) {
        int count = 0;
        int consLs = 0;
        // check for 'A'
        for(int i = 0;i < s.length();i++) {
                if(s.charAt(i)=='A') {
                    count++;
                    if(count>=2) return false;
                } 
                if(s.charAt(i)=='L') {
                    consLs++;
                    if(consLs>=3) return false; 
                } else {
                    consLs = 0;
                }
        }
        

        return true;


    }
}