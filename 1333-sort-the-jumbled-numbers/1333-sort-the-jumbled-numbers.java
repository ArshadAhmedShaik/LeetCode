public class Solution {

    private int map(int num, int[] mapping) {
            String str = String.valueOf(num);
            StringBuilder sb = new StringBuilder();
            for(char ch: str.toCharArray()) {
                    int digit = mapping[ch - '0'];
                    sb.append((char)(digit + '0'));
            }
            return Integer.valueOf(sb.toString());
    }    

    public int[] sortJumbled(int[] mapping, int[] nums) {
                
          int n = nums.length;      
          Integer[] arr = new Integer[n];
          for(int i = 0;i < n;i++) {
                arr[i] = nums[i];
          }    

          Arrays.sort(arr, new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                            int num1 = map(a, mapping);
                            int num2 = map(b, mapping);
                            if(num1>num2) {
                                return 1;
                            } else if(num2>num1) {
                                return -1;
                            } else {
                                return 0;
                            }
                    }
          });

          return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();

    }
} 