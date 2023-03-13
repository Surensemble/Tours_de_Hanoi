package Jeu_Hanoi;
import java.util.Scanner;

import File_Pile.PileEntiers;

public class Hanoi {

    public static void main(String[] args){
        PileEntiers T1= new PileEntiers();
        PileEntiers T2= new PileEntiers();
        PileEntiers T3= new PileEntiers();
        int n;
        n= saisir();
        remplir(n,T1);
        solve(n,T1,T3,T2);

    }



    public static int saisir(){
        int n;
        Scanner in= new Scanner(System.in);

        do {
            System.out.println("entrer le nombre de disque");
            n= in.nextInt();
            if (n<=0){System.out.println(" erreur : nombre de disque invalide");}

        }while (n<=0);
        return n;
    }

    public static void remplir(int k , PileEntiers T){
        while(k>0){
            T.Empiler(k);
            k--;
        }
    }

    // methode permettant de deplacer les pile
    public static void move(PileEntiers P1 , PileEntiers P2){
        Integer tmp;
        if(P1.pile.liste.isEmpty()) {
            tmp = P2.Depiler();
            P1.Empiler(tmp);

        } else if (P2.pile.liste.isEmpty()) {
            tmp = P1.Depiler();
            P2.Empiler(tmp);

        } else if (P1.sommet() > P2.sommet()){ // comparaison des tailles des disques
            tmp= P2.Depiler();
            P1.Empiler(tmp);

        }else{
            tmp=P1.Depiler();
            P2.Empiler(tmp);
        }

    }

    public static void solve(int n , PileEntiers D ,PileEntiers A,PileEntiers I){
        if (n%2==0) {
            int i=1;
            while (A.pile.liste.size()<n){
                System.out.println("etape "+ i);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                move(D,I);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                move(A,D);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                move(I,A);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                i++;
            }
        }else if(n%2==1){
            int i=1;
            while(A.pile.liste.size()<n){
                System.out.println("etape "+ i);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                move(D,A);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                move(D,I);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                move(I,A);
                System.out.println("T1 ="+D.getPile()+"\nT2 ="+I.getPile()+"\nT3 ="+A.getPile() + "\n" + "\n");
                i++;
            }
        }
    }
}

