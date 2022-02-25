package abduls.petStore.pets;

import abduls.petStore.Cat.PersianCat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class persianCatTest {

    @Test
    public void createPersianCatTest01(){
        PersianCat persianCat = new PersianCat("Alex", 2);
        String expected = "meow";
        String actual = persianCat.makesound();
        Assertions.assertEquals(expected,actual);
    }
}
