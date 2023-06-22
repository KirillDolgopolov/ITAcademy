import org.example.Dog;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class TestObjects {


@Test
    public  void testOfDogs() {
        Dog dog1 = new Dog("El Barto", 5);
        Dog dog2 = new Dog("El Peludo", 8);
        Dog dog3 = new Dog("El Peludo", 8);
        Dog dog4 = dog1;

        assertThat(dog4).isEqualTo(dog1);
        assertThat(dog2).isNotEqualTo(dog3);
        assertThat(dog2).usingRecursiveComparison().isEqualTo(dog3);


    }

}
