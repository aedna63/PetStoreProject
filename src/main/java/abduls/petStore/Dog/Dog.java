package abduls.petStore.Dog;

import abduls.petStore.Breed;
import abduls.petStore.Pet;

public abstract class Dog extends Pet {
    private Breed breed;


    public Dog(String name, Integer age, Breed breed){
        super(name, age);
        this.breed = breed;
    }

}
