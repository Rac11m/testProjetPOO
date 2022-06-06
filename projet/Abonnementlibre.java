package projet;



public class Abonnementlibre extends Abonnement{


    private static final int forfaitfixe=-500;

    private static final float TVA=19/100;

    public  Abonnementlibre(Date date,float solde){
        super(date,solde);
}   public  Abonnementlibre(){
    super();
}
    
    public float getSolde() {
        return solde;
}   public static int getForfaitfixe() {
        return forfaitfixe;
}   public static float getTva() {
        return TVA;
}   public void setSolde(float solde) {
        this.solde = solde;
}
    
}