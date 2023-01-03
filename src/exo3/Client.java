package exo2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    String nom ;
    Cafe commandeCafe  ;
    Tasse tasse ;

    static Map<Integer,List<Client>> mapClient =new HashMap<>();
    double valeurFacture  ;

    Client(String nom, Cafe commandeCafe, boolean avecTasse ) {
        this.nom = nom ;
        this.commandeCafe = commandeCafe ;

        if(avecTasse)
            tasse = new Tasse() ;
    }

    public Client(String nom, Cafe commandeCafe, Tasse tasse) {
        this.nom = nom;
        this.commandeCafe = commandeCafe;
        this.tasse = tasse;
    }

    public Client() {
        this.nom = "Jean" ;
        this.tasse = new Tasse() ;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", commandeCafe=" + commandeCafe +
                ", tasse=" + tasse +
                ", valeurFacture=" + valeurFacture +
                '}';
    }
}
