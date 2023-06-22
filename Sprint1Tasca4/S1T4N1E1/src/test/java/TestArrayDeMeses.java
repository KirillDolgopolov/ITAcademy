import org.example.Calendario;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArrayDeMeses {


    @Test
    public void testTieneDocePosiciones() {
        Calendario calend = new Calendario();
        int result = calend.sizeOfArray();
        Assert.assertEquals(12, result);
    }

    @Test
    public void testArrayIsEmpty() {
        Calendario calend = new Calendario();
        boolean esEmpty = calend.arrayIsEmpty();
        Assert.assertEquals(false, esEmpty);
    }

    @Test
    public void testNameOfMonth() {
        Calendario calend = new Calendario();
        String month = calend.getPosicion(8);
        Assert.assertEquals("Agosto", month);

    }

}
