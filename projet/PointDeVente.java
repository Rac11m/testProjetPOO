package projet;

import java.util.Scanner;
public class PointDeVente {
    Scanner Input=new Scanner(System.in);

 private enum Type {principal,secondaire;}
private Type type;
private Adresse adresse;
private String num_de_tel;
private int b=0;
private String nomda ;


public PointDeVente(){}

public PointDeVente(Type type, Adresse adresse, String num_de_tel, int b, String nomda) {
	this.type = type;
	this.adresse = adresse;
	this.num_de_tel = num_de_tel;
	this.b = b;
	this.nomda = nomda;
}


public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}

public Adresse getAdresse() {
	return adresse;
}

public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}

public String getNum_de_tel() {
	return num_de_tel;
}

public void setNum_de_tel(String num_de_tel) {
	this.num_de_tel = num_de_tel;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public String getNomda() {
	return nomda;
}

public void setNomda(String nomda) {
	this.nomda = nomda;
}


}