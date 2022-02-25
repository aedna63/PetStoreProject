package abduls.petStore.Cat;

import abduls.petStore.Pet;

public class Cat extends Pet {

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return null;
    }
}
