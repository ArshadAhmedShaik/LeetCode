class Solution {
    public List<String> cellsInRange(String s) {
        List<String> cells=new ArrayList<>();
        char start=s.charAt(1),end=s.charAt(4),st=s.charAt(0),en=s.charAt(3);
        for(char c=st;c<=en;c++){
            for(char i=start;i<=end;i++){
                cells.add(new String(new char[]{c,i}));
            }
        } 
        return cells;
    }
}