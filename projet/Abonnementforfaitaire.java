package projet;

import java.util.Scanner;
enum Etat{nonepuis�,�puis�};
public class Abonnementforfaitaire extends Abonnement{
private int dur�e;
private float montantforfait;
private Etat etat;
Scanner input= new Scanner(System.in);
public Abonnementforfaitaire(){  
    super();
    System.out.println("veuillez entrer la dur�e de votre forfait(en jours)");
    dur�e=input.nextInt();
    System.out.println("veuillez entrer le montant de votre forfait");
    montantforfait=input.nextFloat();
    etat=Etat.valueOf(input.nextLine());

}



public int getDur�e() {
    return dur�e;
}public Etat getEtat() {
    return etat;
}public float getMontantforfait() {
    return montantforfait;
}public void setDur�e(int dur�e) {
    this.dur�e = dur�e;
}public void setEtat(Etat etat) {
    this.etat = etat;
}public void setMontantforfait(float montantforfait) {
    this.montantforfait = montantforfait;
}
    
public void verif(){//principe v�rifier si le montant est nul : g�n�rer exception 
    //si dur�e == 0 alors fin du mois , d�but du prochain forfait , on r�intialise la valeur 
    // du montantforfait, reste a r�gler le probl�me de la synchro avec date syst�me
    if(dur�e==0){montantforfait=2300;
    etat=Etat.valueOf("nonepuis�");}
    if (montantforfait==0){
        etat=Etat.valueOf("�puis�");
    }
}
@Override public String toString(){
    String Montant=Integer.toString((int)montantforfait);
    return ("le reste de votre montant est : " +Montant +"le reste de la dur�e de votre forfait est :"+this.dur�e+"jours");
}
public void afficher(){
    System.out.println(toString());
    
}
}