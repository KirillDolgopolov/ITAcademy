import org.assertj.core.api.Assertions;
import org.example.Tarjeta;
import org.junit.Test;

public class TestOfObjetoVacio {

    @Test
    public void testSiVacio() {
        Tarjeta tarja1 = new Tarjeta();
        Assertions.assertThat(tarja1.getNombre()).isNullOrEmpty();
        Assertions.assertThat(tarja1.getNumero()).isZero();
    }
}