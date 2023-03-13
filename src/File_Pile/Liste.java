package File_Pile;

import java.util.*;

public class Liste {
    private int position = 0;

    public ArrayList<Object> liste = new ArrayList<Object>();

    public ArrayList<Object> getListe(){
        return this.liste;
    } 

    public void Premier(){
        if (!liste.isEmpty()){position = 0;}
        else {
            System.out.println("error : Empty List");
        }
    }

    public void Dernier(){
        if(!liste.isEmpty()){
            position = liste.size()-1;
        }
        else{
            System.out.println("error: Empty List");
        }
    }

    public Object Suivant(){
        if(liste.isEmpty() || position == liste.size()-1){
            System.out.println("erreur");
            return null;
        }
        else {
            position++;
            return liste.get(position);
        }
    }

    public Object Supprimer(){
        if(!liste.isEmpty()){
            Object element = liste.get(position);
            liste.remove(position);
            return element;
        }
        else{
            System.out.println("erreur");
            return null;
        }

    }

    public void Ajouter(Object element){
        if(position == liste.size()-1){liste.add(element);}
        else{liste.add(position, element);}

    }
}
