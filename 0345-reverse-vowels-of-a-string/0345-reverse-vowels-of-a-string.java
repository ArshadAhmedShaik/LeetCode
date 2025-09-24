class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        Set<Character> set = new HashSet<>(Arrays.asList(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'
        ));
        
        char[] arr = s.toCharArray();
        
        while (start < end) {
            while (start < end && !set.contains(arr[start])) {
                start++;
            }
            while (start < end && !set.contains(arr[end])) {
                end--;
            }
            
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        
        return new String(arr);
    }
}
