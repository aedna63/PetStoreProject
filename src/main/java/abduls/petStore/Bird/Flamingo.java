package abduls.petStore.Bird;

import abduls.petStore.Exotic;

public class Flamingo extends Exotic {


    public Flamingo(String name, Integer age) {
        super(name, age);
    }

    public String makeSound() {
        return "I'm from Rio";
    }
}
