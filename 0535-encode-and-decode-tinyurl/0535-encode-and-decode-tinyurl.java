import java.util.*;

public class Codec {
    private static final String BASE_URL = "http://tinyurl.com/";
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 6;
    private Map<String, String> map = new HashMap<>();
    private Random random = new Random();

    // Generates a random code of length CODE_LENGTH
    private String getRandomCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < CODE_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    // Encodes a URL to a shortened URL
    public String encode(String longUrl) {
        String code;
        // Make sure we don't generate a duplicate code
        do {
            code = getRandomCode();
        } while (map.containsKey(BASE_URL + code));

        String shortUrl = BASE_URL + code;
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
