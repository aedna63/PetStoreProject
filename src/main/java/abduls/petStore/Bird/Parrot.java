package abduls.petStore.Bird;

import abduls.petStore.Exotic;

public class Parrot extends Exotic {
    public Parrot(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "I'm expensive";
    }
}
