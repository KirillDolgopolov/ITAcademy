import org.example.CalculoDni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalcDni {

    @ParameterizedTest
    @CsvSource({
            "71715199, A",
            "23178171, J",
            "56315037, C",
            "68907947, Q",
            "14582325, A",
            "2913260, B",
            "98578127, N",
            "54377912, R",
            "77869983, X",
            "45617153, B"

    })
    void testOfLetraDni(int number, String expChar) {
        CalculoDni miCalc = new CalculoDni();
        assertEquals(expChar, miCalc.calcularLetra(number));
    }

}
