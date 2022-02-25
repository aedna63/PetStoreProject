package abduls.petStore.pets;


import abduls.petStore.Lemur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LemurTest {

    @Test
    public void createLemurTest01() {
        Lemur Lemur = new Lemur("King Julian",21);
        String expected = "King Jullian here";
        String actual = Lemur.makeSound();
        Assertions.assertEquals(expected, actual);
    }
}
