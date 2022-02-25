package abduls.petStore.Dog;

import abduls.petStore.Breed;

public class Yorkie extends Dog {

    public Yorkie(String name, Integer age, Breed breed) {
        super(name, age, breed);
    }

    @Override
    public String makeSound() {
        return "woof";
    }
}
