class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] bool=new boolean[26];
        for(char c: allowed.toCharArray()){
            bool[c-'a']=true;
        }
        int count=0;
        for(String word:words){
            if(helper(word,bool))
            {
            count++;
            }
        }
    
    return count;
}
private boolean helper(String word,boolean[] allowes){
    for(int i=0;i<word.length();i++)
    {
if(!allowes[word.charAt(i)-'a']){
    return false;
}
    }
return true;
}  
}