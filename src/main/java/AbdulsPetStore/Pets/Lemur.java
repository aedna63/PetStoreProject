package AbdulsPetStore.Pets;

public class Lemur extends Exotic{


    public Lemur(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "King Jullian here";
    }
}
