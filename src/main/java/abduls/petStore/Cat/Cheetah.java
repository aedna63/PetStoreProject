package abduls.petStore.Cat;

import abduls.petStore.Exotic;

public class Cheetah extends Exotic {
    public Cheetah(String name, Integer age) {
        super(name, age);
    }

    public String makeSound() {
        return "I'm faster than Usain Bolt";
    }
}
