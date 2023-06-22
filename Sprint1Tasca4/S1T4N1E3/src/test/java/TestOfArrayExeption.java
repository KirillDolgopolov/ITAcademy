import org.example.ClassQueLanzaExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
public class TestOfArrayExeption {


        @Test
        public void testOfArrayEx() {
           int [] myArray = {1,5,8};
            Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, new Executable() {
                @Override
                public void execute() throws Throwable {
                    ClassQueLanzaExeption.daMeExeption(myArray);
                }
            });
        }
    }