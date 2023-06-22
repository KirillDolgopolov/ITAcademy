import org.example.Cat;
import org.example.Dog;
import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestArrays {

    @Test
    public  void TestArrays() {
        List<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();

        Dog dog1 = new Dog("Glovito", 5);
        Dog dog2 = new Dog("Santa's Little Helper", 5);
        Cat cat1 = new Cat("Plumito", 6);
        Cat cat2 = new Cat("Snowball II", 2);

        list1.add(dog1);
        list1.add(dog2);
        list1.add(cat1);
        list1.add(cat2);

        list2.add(dog1);
        list2.add(dog2);
        list2.add(cat1);
        list2.add(cat2);

        Assertions.assertThat(list1).containsExactlyElementsOf(list2);
        Assertions.assertThat(list1).containsExactlyInAnyOrderElementsOf(list2);
        Assertions.assertThat(list1).containsOnlyOnce(cat1);

        Cat cat3 = new Cat("El Vagabundo", 9);

        Assertions.assertThat(list2).doesNotContain(cat3);

    }
}
