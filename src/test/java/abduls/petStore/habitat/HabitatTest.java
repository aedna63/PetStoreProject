package abduls.petStore.habitat;

import abduls.petStore.Breed;
import abduls.petStore.Dog.Pitbull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HabitatTest {

    @Test
    public void constructorTest01(){
        //Given
        Pitbull pitbull = new Pitbull("Mr. 305",35, Breed.PURE_BREED);
        Habitat<Pitbull> habitat = new Habitat<>();
        habitat.addPet(pitbull);

        // When
        Integer expected = 1;
        Integer actual = habitat.getNumberOfPets();

        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeTest01(){
    //Given
        Pitbull pitbull = new Pitbull("Mr 305",12,Breed.MIXED_BREED);
        Habitat<Pitbull> habitat = new Habitat<>();
        habitat.addPet(pitbull);
        habitat.removePet();
        //When
        Integer expected = 0;
        Integer actual = habitat.getNumberOfPets();

        //Then
        Assertions.assertEquals(expected, actual);
    }



    //When

    //Then

}
