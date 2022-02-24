package AbdulsPetStoreTest.PetsTest.PetTest;

import AbdulsPetStore.Pets.Breed;
import AbdulsPetStore.Pets.Dog.Pitbull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PitbullTest {

    @Test
    public void createPitbullTest01(){
        Pitbull pitbull = new Pitbull("Mr.Pit", 6, Breed.PURE_BREED);
        String expected = "Make sound";
        String actual = pitbull.makeSound();
        Assertions.assertEquals(expected,actual);



}
}
