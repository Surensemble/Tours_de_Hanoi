package File_Pile;

public class Pile {
    public Liste pile = new Liste();

    public void  Empiler(Object element){
        if(this.pile.liste.isEmpty()){
            pile.Ajouter(element);}
        else {
            this.pile.Dernier();
            this.pile.Ajouter(element);
        }

    }
    public Object Depiler(){
        pile.Dernier();
        return pile.Supprimer();
    }

}