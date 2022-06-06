package projet;

public class AppelEmis extends Appel{
    enum TypeAppel{meme_operateur,operateur_local,etranger};


	private TypeAppel type;
    private long montant;



	public AppelEmis(){}
    
    public AppelEmis(TypeAppel type, long montant) {
    	this.type = type;
    	this.montant = montant;
    }
    
    public TypeAppel getType() {
		return type;
	}

	public void setType(TypeAppel type) {
		this.type = type;
	}

	public long getMontant() {
		return montant;
	}

	public void setMontant(long montant) {
		this.montant = montant;
	}
    
    @Override
	public String toString() {
		return "type d'appel émis est "+ this.type +", et le montant est de " + this.montant;
	}
	
}