package AbdulsPetStore.Pets.Cat;

import AbdulsPetStore.Pets.Cat.Cat;

public class PersianCat extends Cat {

    public PersianCat(String name, Integer age) {
        super(name, age);
    }

    public String makesound(){
        return "meow";
    }

}
