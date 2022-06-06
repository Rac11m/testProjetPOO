package projet;

public class Appel {
 protected Date date;
 protected float heure;
 protected long duree;
 private String numero;
 

 public Appel(){}
 public Appel(String num,int jours,String mois,int annee,float heure,long duree){
     date=new Date(jours, mois, annee);
     this.heure=heure;
     this.duree=duree;
     numero=num;
 }




 public void setDate(Date date) {
     this.date = date;
 }

 public void setDuree(long duree) {
     this.duree = duree;
 }

 public void setHeure(int heure) {
     this.heure = heure;
 }

 public void setNumero(String numero) {
     this.numero = numero;
 }

 public Date getDate() {
     return date;
 }

 public long getDuree() {
     return duree;
 }

 public float getHeure() {
     return heure;
 }
 
 public String getNumero() {
     return numero;
 }



 

}
