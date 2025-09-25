class Solution {
    public String[] findWords(String[] words) {
        Set<Character> set1 = new HashSet<>(Arrays.asList(
                'q','w','e','r','t','y','u','i','o','p'));
        Set<Character> set2 = new HashSet<>(Arrays.asList(
                'a','s','d','f','g','h','j','k','l'));
        Set<Character> set3 = new HashSet<>(Arrays.asList(
                'z','x','c','v','b','n','m'));

        List<String> list = new ArrayList<>();

        for (String word : words) {
            String str = word.toLowerCase();
            Set<Character> row = null;

       
            char first = str.charAt(0);
            if (set1.contains(first)) row = set1;
            else if (set2.contains(first)) row = set2;
            else row = set3;

            
            boolean valid = true;
            for (char ch : str.toCharArray()) {
                if (!row.contains(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid) list.add(word);
        }

        return list.toArray(new String[0]);
    }
}
