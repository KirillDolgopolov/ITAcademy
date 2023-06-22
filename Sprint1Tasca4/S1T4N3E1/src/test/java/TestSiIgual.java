import org.example.TestIgualidad;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSiIgual {

    @Test
    public
    void testIgualONo() {

        assertThat(TestIgualidad.enteroIgualTrueFalse(2, 3)).isFalse();
        assertThat(TestIgualidad.enteroIgualTrueFalse(6, 6)).isTrue();
        assertThat(TestIgualidad.enteroIgualTrueFalse(5, 5)).isTrue();
    }

}
