class OrderedStream {
    String[] hash;
    int ptr = 1;

    public OrderedStream(int n) {
        hash = new String[n + 1];
    }
    
    public List<String> insert(int idKey, String value) {
        hash[idKey] = value;
        List<String> res = new ArrayList<>();
        
        while (ptr < hash.length && hash[ptr] != null) {
            res.add(hash[ptr++]);
        }

        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */