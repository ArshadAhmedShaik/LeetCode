class Solution {
         public String largestGoodInteger(String num) {
        char[] charArray = num.toCharArray();
        char maxChar = ' ';
        for(int i =2; i<num.length();i++){
            if(charArray[i]==charArray[i-1] && charArray[i]==charArray[i-2]){
                maxChar = (char) Math.max( maxChar, charArray[i]);
            }
        }
        return  maxChar==' '?"":new String(new char[]{maxChar,maxChar,maxChar});
    }

}