class Solution {
    public List<String> cellsInRange(String s) {

        List<String> ans = new ArrayList<>();
         
         char first = s.charAt(0);
         int row1 = s.charAt(1)-'0';
         char second = s.charAt(3);
         int row2 = s.charAt(4)-'0';

         for(char ch = first;ch <= second;ch++) {
                  for(int j = row1;j <= row2;j++) {
                            
                            ans.add(ch + "" + j);

                  }  
         } 


         return ans;
         

    }
}