package projet;

import java.util.Scanner;
public class Abonnement {
    Date dateabo;
    float solde;
    Scanner input=new Scanner(System.in);
    public  Abonnement(){
        dateabo=new Date();
        System.out.println("veuillez rentrer la valeur du montant");
        solde=input.nextFloat();
    }
    public  Abonnement(Date d,float montant){
        dateabo=d;
        this.solde=montant;
    }


}
