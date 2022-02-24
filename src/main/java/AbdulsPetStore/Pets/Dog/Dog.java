package AbdulsPetStore.Pets.Dog;

import AbdulsPetStore.Pets.Breed;
import AbdulsPetStore.Pets.Pet;

public abstract class Dog extends Pet {
    private Breed breed;


    public Dog(String name, Integer age, Breed breed){
        super(name, age);
        this.breed = breed;
    }

}
