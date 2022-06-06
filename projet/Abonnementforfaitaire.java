package projet;

import java.util.Scanner;
enum Etat{nonepuisé,épuisé};
public class Abonnementforfaitaire extends Abonnement{
private int durée;
private float montantforfait;
private Etat etat;
Scanner input= new Scanner(System.in);
public Abonnementforfaitaire(){  
    super();
    System.out.println("veuillez entrer la durée de votre forfait(en jours)");
    durée=input.nextInt();
    System.out.println("veuillez entrer le montant de votre forfait");
    montantforfait=input.nextFloat();
    etat=Etat.valueOf(input.nextLine());

}



public int getDurée() {
    return durée;
}public Etat getEtat() {
    return etat;
}public float getMontantforfait() {
    return montantforfait;
}public void setDurée(int durée) {
    this.durée = durée;
}public void setEtat(Etat etat) {
    this.etat = etat;
}public void setMontantforfait(float montantforfait) {
    this.montantforfait = montantforfait;
}
    
public void verif(){//principe vérifier si le montant est nul : générer exception 
    //si durée == 0 alors fin du mois , début du prochain forfait , on réintialise la valeur 
    // du montantforfait, reste a régler le problème de la synchro avec date système
    if(durée==0){montantforfait=2300;
    etat=Etat.valueOf("nonepuisé");}
    if (montantforfait==0){
        etat=Etat.valueOf("épuisé");
    }
}
@Override public String toString(){
    String Montant=Integer.toString((int)montantforfait);
    return ("le reste de votre montant est : " +Montant +"le reste de la durée de votre forfait est :"+this.durée+"jours");
}
public void afficher(){
    System.out.println(toString());
    
}
}