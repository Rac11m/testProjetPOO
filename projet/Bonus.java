package projet;
import java.util.Scanner;
enum Type_Bonus{EXTRA_SMS,EXTRA_HADRA,SOLD}
public class Bonus {
public  Scanner sc=new Scanner(System.in);
	
	//variables
	private Type_Bonus bonus;
	private Date dateLimiteDeConsommation =new Date();
	
	//constructor without argument 
		Bonus(){}
		
		//constructor with argument
		public Bonus(Type_Bonus bonus, Date dateLimiteDeConsommation) {
			super();
			this.bonus = bonus;
			this.dateLimiteDeConsommation = dateLimiteDeConsommation;
		}
		
	
	
	//gets & sets
	public Date getDateLimiteDeConsommation() {
		return dateLimiteDeConsommation;
	}
	public Type_Bonus getBonus() {
		return bonus;
	}
	public void setBonus(Type_Bonus bonus) {
		this.bonus = bonus;
	}
	public void setDateLimiteDeConsommation(Date dateLimiteDeConsommation) {
		this.dateLimiteDeConsommation = dateLimiteDeConsommation;
	}
	
	
	//method toString
	public String toString() {
		return "Bonus [bonus=" + bonus + ", dateLimiteDeConsommation=" + dateLimiteDeConsommation + "]";
	}
	
	
	//method scanner
	public void saisir() {
		System.out.println("entre le type de bonus: ");
		switch(sc.next()) {
		case "EXTRA_HADRA" :bonus=Type_Bonus.valueOf("EXTRA_HADRA");break;
		case "EXTRA_SMS" :bonus=Type_Bonus.valueOf("EXTRA_SMS");break;
		case "SOLD" :bonus=Type_Bonus.valueOf("SOLD");break;
		default :System.out.println("pas de bonus correspondant");
		}
		System.out.println("la date limite de consumation est :");
		this.dateLimiteDeConsommation.Saisir();
	}
	
	//print 
	public void afficher() {
		System.out.println("le type de bonus est :"+getBonus());
		System.out.println("la date limite de consumation est :"+getDateLimiteDeConsommation());
		
	}

	 
		

	
	
}
