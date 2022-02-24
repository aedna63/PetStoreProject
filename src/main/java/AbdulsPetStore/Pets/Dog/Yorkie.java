package AbdulsPetStore.Pets.Dog;

import AbdulsPetStore.Pets.Breed;
import AbdulsPetStore.Pets.Dog.Dog;

public class Yorkie extends Dog {

    public Yorkie(String name, Integer age, Breed breed) {
        super(name, age, breed);
    }

    @Override
    public String makeSound() {
        return "woof";
    }
}
