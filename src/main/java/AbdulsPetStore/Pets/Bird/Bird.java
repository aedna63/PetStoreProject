package AbdulsPetStore.Pets.Bird;

import AbdulsPetStore.Pets.Pet;

public class Bird extends Pet {
    public Bird(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return null;
    }
}
