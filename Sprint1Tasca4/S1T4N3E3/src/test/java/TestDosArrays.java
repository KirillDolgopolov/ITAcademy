import org.assertj.core.api.Assertions;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TestDosArrays {

    @Test
    public void TestElementsArray() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 5, 9, 7));

        Assertions.assertThat(list1).containsExactlyElementsOf(list2);
        Assertions.assertThat(list1).containsExactlyInAnyOrderElementsOf(list3);

    }
}