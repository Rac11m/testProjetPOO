package projet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class test {
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int choix;
		char test;
		do {
		System.out.println(
				  "1.Remplissage automatique des donn�es\n"
				+ "2. Gestion de l�op�rateur\n"
				+ "3. Gestion des clients (num�ros)\n"
				+ "4. Gestion des factures\n"
				+ "5. Gestion des bonus\n"
				+ "6. Quitter\n"
				+ "Veuillez choisir l'op�ration � effectuer: ");
		
		choix = sc.nextInt();
		
		switch(choix) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println(
			"1. Ajouter num�ro\n"
			+"2. Modifier num�ro (modifier adresse, d�bloquer)\n"
			+"3. Supprimer num�ro\n"
			+"4. Afficher la collection des clients par type d�abonnement\n"
			+"5. Quitter\n"
			+"Veuillez choisir l'op�ration � effectuer: ");
			choix = sc.nextInt();
			switch(choix) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.exit(0);
				break;
			}
			break;
		case 4: 
			System.out.println(
					"1. Etablir facture pour un num�ro donn�\n"
					+"2. Afficher tous les num�ros arriv�s � �ch�ance de paiement\n"
					+"3. Toutes les factures en instance de paiement\n"
					+"4. Relancer les num�ros pour les rechargements/ paiements\n"
					+"5. Quitter\n"
					+"Veuillez choisir l'op�ration � effectuer: ");
			choix = sc.nextInt();
			switch(choix) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				
				System.exit(0);
				break;
			}
			break;
		case 5:
			System.out.println(
					"1. Affecter bonus � des clients\n"
					+"2. Afficher les clients ayant b�n�fici� de bonus\n"
					+"3. Quitter\n"
					+"Veuillez choisir l'op�ration � effectuer: ");
					choix = sc.nextInt();
					switch(choix) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						System.exit(0);
						break;
					}
			break;
		case 6:
			System.exit(0);
			break;
		default:	
		}
		
		System.out.println("Souhaitez-vous refaire une op�ration(y/n): ");
		test = sc.next().charAt(0);
		}while(test=='y');
		
	}
	
    public static void main(String[] args) {
        Date date=new Date();

        Calendar calendar= GregorianCalendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MINUTE));

       menu();
    }
}   
