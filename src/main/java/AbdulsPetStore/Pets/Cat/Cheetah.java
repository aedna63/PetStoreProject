package AbdulsPetStore.Pets.Cat;

import AbdulsPetStore.Pets.Cat.Cat;

public class Cheetah extends Cat {
    public Cheetah(String name, Integer age) {
        super(name, age);
    }

    public String makeSound() {
        return "I'm faster than Usain Bolt";
    }
}
