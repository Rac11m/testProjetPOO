package projet;
import java.util.Vector;
import java.util.Scanner;

public class Client {
    Scanner Input= new Scanner(System.in);


    enum Type {forfaitaire,prepaye,libre}
    enum Etat{bloqué,nonbloqué}

	private String num_de_tel ,nom,prenom,numero_de_contrat;
    private Type type ;
    private Date date_contrat;
    private Operateur op;
    private Abonnement ab;
    private Adresse adr;
    private AdresseMail adrmail;
    private Vector<Appel> appels=new Vector<Appel>();
    private Etat etat;
    private float forfait;

    
    public Client(){}

    public Client(String num_de_tel, String nom, String prenom, String numero_de_contrat, Type type, Date date_contrat,
			Operateur op, Abonnement ab, Adresse adr, AdresseMail adrmail, Vector<Appel> appels, Etat etat,
			float forfait) {
		this.num_de_tel = num_de_tel;
		this.nom = nom;
		this.prenom = prenom;
		this.numero_de_contrat = numero_de_contrat;
		this.type = type;
		this.date_contrat = date_contrat;
		this.op = op;
		this.ab = ab;
		this.adr = adr;
		this.adrmail = adrmail;
		this.appels = appels;
		this.etat = etat;
		this.forfait = forfait;
	}
    
    
	public String getNum_de_tel() {
		return num_de_tel;
	}

	public void setNum_de_tel(String num_de_tel) {
		this.num_de_tel = num_de_tel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumero_de_contrat() {
		return numero_de_contrat;
	}

	public void setNumero_de_contrat(String numero_de_contrat) {
		this.numero_de_contrat = numero_de_contrat;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Date getDate_contrat() {
		return date_contrat;
	}

	public void setDate_contrat(Date date_contrat) {
		this.date_contrat = date_contrat;
	}

	public Operateur getOp() {
		return op;
	}

	public void setOp(Operateur op) {
		this.op = op;
	}

	public Abonnement getAb() {
		return ab;
	}

	public void setAb(Abonnement ab) {
		this.ab = ab;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	public AdresseMail getAdrmail() {
		return adrmail;
	}

	public void setAdrmail(AdresseMail adrmail) {
		this.adrmail = adrmail;
	}

	public Vector<Appel> getAppels() {
		return appels;
	}

	public void setAppels(Vector<Appel> appels) {
		this.appels = appels;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public float getForfait() {
		return forfait;
	}

	public void setForfait(float forfait) {
		this.forfait = forfait;
	}


   

    
    
}

    


