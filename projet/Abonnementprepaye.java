package projet;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


enum Etatduportefeuille{actif,nonactif};
public class Abonnementprepaye extends Abonnement {
Calendar calendar= GregorianCalendar.getInstance();
private ArrayList <String> acdr= new ArrayList<String>();//sauvegarder les cartes utilis�es 
private Date datedactiv;
private float montantsolde;
Scanner input=new Scanner(System.in);
private int dur�eDate;
private Etatduportefeuille etatPorteFeuille;





public Abonnementprepaye(){
    super();
}
public Abonnementprepaye(Date d, float montant, float s){
    super(d,montant);
    montantsolde=s;
}

public void setDatedactiv(int jour, int mois , int annee) {
    datedactiv.setannee(annee);
    datedactiv.setjour(jour);
    datedactiv.setMoi(mois);
}
public void setMontantsolde(float montantsolde) {
    this.montantsolde = montantsolde;
}
public ArrayList<String> getAcdr() {
    return acdr;
}public Calendar getCalendar() {
    return calendar;
}public Date getDatedactiv() {
    return datedactiv;
}public int getDur�eDate() {
    return dur�eDate;
}public void setDur�eDate(int dur�eDate) {
    this.dur�eDate = dur�eDate;
}public Etatduportefeuille getetatPorteFeuille() {
    return etatPorteFeuille;
}public void setetatPorteFeuille(String s) {
    this.etatPorteFeuille = Etatduportefeuille.valueOf(s);
}




public void rechargesolde(cartederecharge c) {
    do{
    if(( c.getDatedevalidite()).verifvalidite()){
        if(c.getetatPorteFeuille()==Etatduportefeuille.valueOf("valide")){
            if(!acdr.contains(c.getNumerodeserie())){ //on v�rifie si la carte n'a pas d�j� été utilisée 
            acdr.add(c.getNumerodeserie());
            setMontantsolde(c.getMontant());
            setDatedactiv(calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.MONTH),calendar.get(Calendar.YEAR));//je veux mettre la date et l'heure ta3 le moment actuel f la date d'activation
            c.setetatPorteFeuille("desactiv�");
            setetatPorteFeuille("actif");
            }
        }
    }else{System.out.println("cette carte est déjà utilisée!!!");}
System.out.println("voulez vous faire une autre recharge? [y/n]");}
while(input.nextLine()=="y");
}
@Override public String toString(){
    return("le reste de votre solde est : " + montantsolde+" la durée restante de cette recharge est : "+this.dur�eDate);
}
public void afficher(){
    System.out.println(toString());
}
public void verif(){
    if(montantsolde==0 || dur�eDate==0){
        setetatPorteFeuille("nonActif");//donc il peut que recevoir


    }
} 
  
}