package AbdulsPetStoreTest.PetsTest.PetTest;


import AbdulsPetStore.Pets.Bird.Parrot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParrotTest {

    @Test
    public void createPitbullTest01() {
        Parrot parrot = new Parrot("Rio", 5);
        String expected = "Make sound";
        String actual = parrot.makeSound();
        Assertions.assertEquals(expected, actual);
    }
}
