package AbdulsPetStore.Pets.Dog;

import AbdulsPetStore.Pets.Breed;

public class Pitbull extends Dog {

    public Pitbull(String name, Integer age, Breed breed) {
        super(name, age, breed);
    }

    @Override
    public String makeSound() {
        return "I'm Mr.305";
    }
}
