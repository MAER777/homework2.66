import java.util.*;

public class Words {
    public List<String> uniqueWords (List<String> words) {
        List<String> uniqueWords;
//        Set<String> setDuplicate = new HashSet<>();
//        for (String word : words) {
//            if (!setDuplicate.add(word)) {
//                duplicate.add(word);
//            }
//        }
        Set<String> setDuplicate = new HashSet<>(words);
        uniqueWords = new ArrayList<>(setDuplicate);
        return uniqueWords;
    }

    public Map<String, Integer> duplicateWord (List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }
}
