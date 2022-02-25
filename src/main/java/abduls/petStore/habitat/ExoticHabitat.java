package abduls.petStore.habitat;

import abduls.petStore.Exotic;

import java.util.ArrayList;

public class ExoticHabitat <P extends Exotic> extends Habitat<P> {
    public ExoticHabitat(){
        super();
    }
    public ExoticHabitat(ArrayList<P> pets){
        super(pets);
    }
}
