package projet;

import java.util.Scanner;

enum etatCarte{active,desactive};
public class cartederecharge {
    private String numerodeserie;
    private Date datedevalidite;
    private int montant;
    private etatCarte etat;
    Scanner input;

    public cartederecharge(){
        System.out.println("veuillez rentrer le numero de serie de ");
        numerodeserie=input.nextLine();
        System.out.println("veuillez rentrer sa date de validitée");
        datedevalidite= new Date();
        System.out.println("veuillez rentrer le montant de la recharge");
        montant=input.nextInt();
        String s="active";
        String ns="desactive";
        if(this.etat==etatCarte.valueOf(s)){System.out.println("votre carte de rechargement est maintenant désactivé");
        this.etat=etatCarte.valueOf(ns);}//remarque au futur moi , on peut mettre Ã§a dans une mÃ©thode dans la classe abonnement
        else{System.out.println("cette carte de rechargement est dÃ©jÃ  utilisÃ©e");}

    }
    
    public cartederecharge(String nds,Date d,int m){
        numerodeserie=nds;
        datedevalidite=d;
        montant=m;

    }








    public etatCarte getetatCarte() {
        return etat;
    }
    public String getNumerodeserie() {
        return numerodeserie;
    }
    public int getMontant() {
        return montant;
    }
    public Date getDatedevalidite() {
        return datedevalidite;
    }
    public void setDatedevalidite(Date datedevalidite) {
        this.datedevalidite = datedevalidite;
    }
    public void setetatCarte(String s) {
        this.etat = etatCarte.valueOf(s);
    }
    public void setMontant(int montant) {
        this.montant = montant;
    }
    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }


}
