package abduls.petStore.pets;


import abduls.petStore.Bird.Flamingo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlamingoTest {

    @Test
    public void createFlamingoTest01() {
        Flamingo flamingo = new Flamingo("Mr Pink", 10);
        String expected = "I'm from Rio";
        String actual = flamingo.makeSound();
        Assertions.assertEquals(expected, actual);
    }
}
