package abduls.petStore.habitat;

import abduls.petStore.Pet;

import java.util.ArrayList;

public class Habitat<P extends Pet>  {
    private ArrayList<P> pets;

    public Habitat(){
        this.pets = new ArrayList<>();
    }

    public Habitat(ArrayList<P> pets){
        this.pets = pets;
    }

    public P removePet(){
        P pet = pets.remove(0);
        return pet;
    }

    public void addPet(P pet){
        pets.add(pet);
    }

    public Integer getNumberOfPets(){
        return pets.size();
    }
}
