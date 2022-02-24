package AbdulsPetStoreTest.PetsTest.PetTest;

import AbdulsPetStore.Pets.Cat.AlbinoJaguar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class albinoJaguarTest {

    @Test
    public void createAlbinoJaguarTest01(){
        AlbinoJaguar albinoJaguar = new AlbinoJaguar("Jax",2);
        String expected = "I have a pigmentation problem";
        String actual = albinoJaguar.makeSound();
        Assertions.assertEquals(expected,actual);




    }

}
