package File_Pile;

import java.util.ArrayList;

public class PileEntiers extends Pile {

    public PileEntiers(){
        super();
    }

    public void Empiler(Integer element) {
        super.Empiler(element);
    }

    public Integer Depiler() {
        Integer result = (Integer) super.Depiler();
        return  result;
    }

    public ArrayList<Object> getPile(){
        return this.pile.getListe();
    }

    public int sommet(){
        return (int)pile.liste.get(pile.liste.size()-1);

    }
}

