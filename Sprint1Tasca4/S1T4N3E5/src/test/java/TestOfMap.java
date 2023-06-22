

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;

public class TestOfMap {


    @Test
    public void TestingOfMap() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("Banana", 7);
        testMap.put("Manzana", 4);
        testMap.put("Kiwi", 1);
        testMap.put("Cerdo", 0);

        Assertions.assertThat(testMap).containsKey("Banana");

    }



}