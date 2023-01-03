package exo2;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    Cafetiere cafetiere ;
    double profit ;

    List<Client> listeClientExpulse;

    ArrayList<Client> listeClientServi;

    private String nom;

    public Restaurant(String nom){
        this.nom = nom;
        cafetiere = new Cafetiere() ;
        this.listeClientServi = new ArrayList<>();
        listeClientExpulse = new ArrayList<>();
    }

    Restaurant() {
        this.nom = "Le Restaurant";
        cafetiere = new Cafetiere() ;
        this.listeClientServi = new ArrayList<>();
        listeClientExpulse = new ArrayList<>();

    }

    boolean servir(Client client) {

        double valeurFacture = 0 ;

        // Verification Si Client Valide
        if(client.commandeCafe == null || client.commandeCafe.typeCafe == TypeCafe.BATARD)
        {
            valeurFacture = 0 ;
            System.out.println("Hors de mon resto");
            return false ;
        }

        // Verification Si client Tasse
        if(client.tasse == null)
        {
            if(client.commandeCafe.quantiteLiquideMl > 100)
            {
                valeurFacture += 3 ;
                client.tasse = new Tasse(500) ;
            }
            else
            {
                valeurFacture += 2 ;
                client.tasse = new Tasse() ;
            }
        }

        // Facture Mon Client
        valeurFacture += client.commandeCafe.typeCafe.coutParMl * client.commandeCafe.quantiteLiquideMl ;

        // Remplit tasse
        cafetiere.remplirTasse(client.tasse, client.commandeCafe.typeCafe, client.commandeCafe.quantiteLiquideMl);

        profit += valeurFacture ;

        client.valeurFacture = valeurFacture ;
        return true;
    }

    public String getNom() {
        return nom;
    }
}
