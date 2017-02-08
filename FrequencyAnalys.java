import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyAnalys {

    public Map<String, Integer> getFrequency(String[] words) {
        Map<String,Integer> wordFrequency = new HashMap<String,Integer>();
        for(String word : words) {
            Integer f = wordFrequency.get(word);
            if (f == null) {
                wordFrequency.put(word, 1);
            } else {
                wordFrequency.put(word, f+1);
            }
        }
        Map<String,Integer> result = new LinkedHashMap<String,Integer>();
        wordFrequency.entrySet().stream().sorted(descendingFrequencyOrder()).forEach(x -> result.put(x.getKey(), x.getValue()));
        return result;
    }

    private static Comparator<Map.Entry<String, Integer>> descendingFrequencyOrder() {
        return Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue).reversed();
    }
}
