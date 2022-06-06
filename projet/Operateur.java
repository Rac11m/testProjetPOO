package projet;


import java.util.ArrayList;

public class Operateur {
    private String nom;

	private ArrayList<PointDeVente> v_point_de_vente= new ArrayList<PointDeVente>();
    private ArrayList<String[]>  willaya =new ArrayList<String[]>();
    private VectClients clients;


    public Operateur(){}

    public Operateur(String n,ArrayList<PointDeVente> d){
        this.nom=n;
    }

    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	


}    

