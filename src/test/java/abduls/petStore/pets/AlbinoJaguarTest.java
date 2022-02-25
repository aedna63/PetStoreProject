package abduls.petStore.pets;

import abduls.petStore.Cat.AlbinoJaguar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlbinoJaguarTest {

    @Test
    public void createAlbinoJaguarTest01(){
        AlbinoJaguar albinoJaguar = new AlbinoJaguar("Jax",2);
        String expected = "I have a pigmentation problem";
        String actual = albinoJaguar.makeSound();
        Assertions.assertEquals(expected,actual);




    }

}
