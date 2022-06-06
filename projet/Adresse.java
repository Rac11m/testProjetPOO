package projet;

import java.util.Scanner;
public class Adresse {
	
String nomRue,codePostal,wilaya;
Scanner input=new Scanner(System.in);
	
	//constructeur

	public Adresse(String nomRue,String codePostal,String willaya) 
	{
		this.nomRue=nomRue;
		this.codePostal=codePostal;
		this.wilaya=willaya;	
	}


	public Adresse()
	{
	System.out.println("veuillez entrer votre nom de Rue");
	nomRue=input.nextLine();
	System.out.println("veuillez entrer votre codePostale");
	codePostal=input.nextLine();
	System.out.println("veuillez entrer le nom de votre ville :");
	wilaya=input.nextLine();
	
	}
	




	//Methodes
	
	void Afficher()
	{
		System.out.println(
						"\n Nom Rue: "+nomRue
						+"\n Code postal: "+codePostal
						+"\n Ville: "+wilaya
						);
		
		
	}
	
	public void setNewAdress(String numero , String nomRue,String codePostal,String wilaya) 
	{
		this.nomRue=nomRue;
		this.codePostal=codePostal;
		this.wilaya=wilaya;
		
		
		
	}
	
	public String getCodePostal()
	{
		return codePostal;
		
	}
	
	
}
