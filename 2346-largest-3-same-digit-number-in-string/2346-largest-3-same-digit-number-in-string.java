class Solution {
    public String largestGoodInteger(String num) {

        int count = 0;
        String largest = "";
        for (int i = 0; i < num.length(); i++) {
            if (i <= num.length() - 3) {
                boolean isEqual = true;
                for (int j = i + 1; j <= i + 2; j++) {
                    if (num.charAt(j) != num.charAt(i)) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                     char ch2 = num.charAt(i);
                    if(largest.equals("")) {
                            largest = "" + ch2 + ch2 + ch2;
                    } else {
                    char ch1 = largest.charAt(0);
                   
                    if (ch2 > ch1) {
                        largest = "" + ch2 + ch2 + ch2;
                    }
                    }
                }
            }
        }

        return largest;

    }
}