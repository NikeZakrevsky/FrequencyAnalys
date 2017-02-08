import org.junit.Test;

import java.util.Map;

public class Main {

    @Test
    public void test() {
        String[] word = {
                "qr","qrr","w","r","w","qr"
        };
        FrequencyAnalys frequencyAnalys = new FrequencyAnalys();
        Map<String, Integer> frequency = frequencyAnalys.getFrequency(word);
        frequency.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
