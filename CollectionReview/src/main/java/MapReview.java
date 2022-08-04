import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergiu");
        map.put(2, "Moses");
        System.out.println(map.get(2));//printing Moses

        System.out.println(firstNonRepeat("deo java developer"));

        //first non-repeating chars in the string


    }

    public static char firstNonRepeat(String str) {
        Map<Character, Integer> charMap = new HashMap<>();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (charMap.containsKey(c)) {
                count = charMap.get(c);
                charMap.put(c, count + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        System.out.println(charMap);
        for (char character : str.toCharArray()) {
            if (charMap.get(character) == 1) return character;
        }
        return Character.MIN_VALUE;
    }
}
