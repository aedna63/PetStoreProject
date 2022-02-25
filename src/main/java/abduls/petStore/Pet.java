package abduls.petStore;

public abstract class Pet {
    String name;
    int age;

    public Pet(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makeSound();

}
