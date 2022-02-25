package abduls.petStore.Bird;

import abduls.petStore.Pet;

public class Bird extends Pet {
    public Bird(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return null;
    }
}
