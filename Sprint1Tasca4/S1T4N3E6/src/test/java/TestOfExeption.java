
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestOfExeption {

    @Test
    public void TestExeption() {
        int[] arrayForTest = {1, 4, 64, 234};

        try {
            int x = arrayForTest[arrayForTest.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            Assertions.assertThat(e).isInstanceOf(ArrayIndexOutOfBoundsException.class);
        }

    }

}
