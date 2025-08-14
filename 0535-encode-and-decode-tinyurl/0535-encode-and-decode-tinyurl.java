public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
           StringBuilder sb = new StringBuilder(longUrl);
           sb.append("123");
           return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder sb = new StringBuilder(shortUrl);
        sb.delete(shortUrl.length()-3, shortUrl.length());
        return sb.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));