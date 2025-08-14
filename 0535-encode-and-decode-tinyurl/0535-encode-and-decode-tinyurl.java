public class Codec {

    Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
            String random = "abxx546";
            map.put("http://tinyurl.com/" + random, longUrl);
            return "http://tinyurl.com/" + random;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
          return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));