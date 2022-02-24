package AbdulsPetStore.Pets.Cat;

import AbdulsPetStore.Pets.Cat.Cat;

public class AlbinoJaguar extends Cat {


    public AlbinoJaguar(String name, Integer age) {
        super(name, age);
    }

    public String makeSound(){
        return "I have a pigmentation problem";
    }

}
