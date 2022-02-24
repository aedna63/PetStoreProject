package AbdulsPetStoreTest.PetsTest.PetTest;


import AbdulsPetStore.Pets.Breed;
import AbdulsPetStore.Pets.Dog.Yorkie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YorkieTest {

    @Test
    public void createYorkieTest01() {
        Yorkie yorkie = new Yorkie("Mr.305", 1, Breed.MIXED_BREED);
        String expected = "Make sound";
        String actual = yorkie.makeSound();
        Assertions.assertEquals(expected, actual);
    }

}
