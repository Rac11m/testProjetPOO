package projet;

import java.util.Vector;


import java.util.Scanner;

public class VectClients {
    Scanner Input= new Scanner(System.in);

    private Vector<Client> clients =new Vector<Client>();

    public VectClients(){}

    public int taille(){//retourn la taille du vecteur
        return clients.size();
    }
    public void Remplir(){
    }
    
    public void remplir(){
        System.out.println("veuillez saisir le nomvre de profil à saisir:\t");
        int n=Input.nextInt();
        for (int i = 0; i < n; i++) {
            Client c = new Client();
            System.out.println("veuillez entrer les informations du client numero "+(i+1));
            //c.Saisir_client();
            clients.add(c);
        }


    }

    public boolean existe(Client c){
        return clients.contains(c);
    }

    public void afficher(){
        if(clients.isEmpty()){
            System.out.println("il n'y a pas de clients");
        }
        else{
            for(int i=0; i<this.taille();i++){
                System.out.println(" client\t"+(i+1));
                System.out.println(clients.elementAt(i).toString());
            }
        }
    }

    public void add_client(Client c){
        if(!this.existe(c)){
            clients.add(c);
        }else{
            System.out.println("le client existe deja");
        }
    }



}
