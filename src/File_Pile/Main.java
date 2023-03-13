package File_Pile;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PileEntiers P1 = new PileEntiers();
        PileEntiers P2 = new PileEntiers();
        PileEntiers P3 = new PileEntiers();

        for(int i = 0; i<5; i++){
            int entier = (int) ((Math.random()*(2000))-1000);
            P1.Empiler(entier);
        }

        for(int i=0; i<P1.pile.liste.size();i++){
            Integer element = (Integer) P1.pile.liste.get(i);
            if(checkEven(element)){
                P2.Empiler(element);
            }
            else{P3.Empiler(element);}
            System.out.println("Etape"+" "+ i);
            System.out.println("P1 :"+" "+P1.pile.liste);
            System.out.println("P2 :"+" "+P2.pile.liste);
            System.out.println("P3 :"+" "+P3.pile.liste);
            System.out.println("\n\n");
        }


    }
    public static boolean checkEven(int n){// Vérifie si un nombre est pair
        if(n % 2 == 0) return true;
        else {return false;}
    }
}



