package AbdulsPetStoreTest.PetsTest.PetTest;

import AbdulsPetStore.Pets.Cat.Cheetah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class cheetahTest {

    @Test
    public void createCheetahTest01(){
        Cheetah cheetah = new Cheetah("Chester", 50);
        String expected = "I'm faster than Usain Bolt";
        String actual = cheetah.makeSound();
        Assertions.assertEquals(actual,expected);
    }
}
