package AbdulsPetStore;

public class Staff<P> extends Person implements PetFeeder<P>, PetCleaner<P> {

    private Integer staffID;
    private Integer idCount = 1;

    public Staff(String name, Integer staffID) {
        super(name);
        this.staffID = staffID;
        idCount++;
    }

    public String greets(){
        return "Welcome to Abdul's PetStore, how may I help you?";
    }
    @Override
    public void cleanThePet(P Pet) {

    }

    @Override
    public void feedThePet(P pet) {

    }
}
