package medecin.main;

import java.util.Scanner;

import medecin.models.Hopital;
import medecin.service.Service;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();
        Hopital hopital;
        String nom, adresse;
        int choix;

        do{
        System.out.println("1-Créer un hopital");
        System.out.println("2-Lister les hopitaux");
        System.out.println("3-Créer un medecin");
        System.out.println("4-Lister les medecins");
        System.out.println("5-Lister les medecins d'un hopital");
        System.out.println("6-Quitter");
        System.out.println("Choisissez une option : ");
        choix=sc.nextInt();
        sc.nextLine();
        switch (choix) {
            case 1:
                    System.out.println("Saisir le nom de l'hopital");
                    nom=sc.nextLine();
                    System.out.println("Saisir l'adresse de l'hopital");
                    prenom=sc.nextLine();
                    hopital = new Hopital();
                    hopital.setNom(nom);
                    hopital.setAdresse(adresse);
                    service.addHopital(hopital);
                break;
            case 2:
                    service.listerHopital();
                break;
            default:
                break;
        }
    }while(choix!=6);
    sc.close();



    }
}

