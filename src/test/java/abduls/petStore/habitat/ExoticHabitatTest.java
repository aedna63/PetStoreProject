package abduls.petStore.habitat;

import abduls.petStore.Cat.Cheetah;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExoticHabitatTest {

    @Test
    public void constructorTest01(){
        //Given
        Cheetah cheetah = new Cheetah("Chester", 4);
        ExoticHabitat exoticHabitat = new ExoticHabitat<>();
        exoticHabitat.addPet(cheetah);

        //When
        Integer expected = 1;
        Integer actual = exoticHabitat.getNumberOfPets();

        //Then
        Assertions.assertEquals(expected, actual);

    }
}
