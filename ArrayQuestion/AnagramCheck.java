package ArrayQuestion;
import java.util.*;
public class AnagramCheck {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnargam(s, t));
    }
    public static boolean isAnargam(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        Map<Character,Integer>  counter = new HashMap<>();
        for (char c : s.toCharArray()){
            counter.put(c, counter.getOrDefault(c, 0) +1);

        }
        for (char c : t.toCharArray()){
            counter.put(c, counter.get(c) -1);
            if (counter.get(c)==0){
                counter.remove(c);
            }
        }
        return counter.isEmpty();
    }
}
