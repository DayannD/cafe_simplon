package exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Restaurant> resto = new ArrayList<>(Arrays.asList(
                new Restaurant(),
                new Restaurant("Une tasse de joie"),
                new Restaurant("Latte sur les Rochers")
        )
        );
        for (Integer i = 0; i < 3; i++) {
            List<Client> client = new ArrayList<>();
            for (int j = 0; j < 20; j++) {
                client.add(new Client(
                        BanqueDeDonne.listeNoms.get(rand.nextInt(BanqueDeDonne.listeNoms.size())),
                        BanqueDeDonne.listeCommandes.get(rand.nextInt(BanqueDeDonne.listeCommandes.size())),
                        BanqueDeDonne.listeTasses.get(rand.nextInt(BanqueDeDonne.listeTasses.size()))
                ));
            }
            Client.mapClient.put(i, client);
        }

        for (List<Client> clientList : Client.mapClient.values()) {
            for (Client client :
                    clientList) {
                Restaurant restaurant = resto.get(rand.nextInt(resto.size()));
                if (restaurant.servir(client)) {
                    restaurant.listeClientServi.add(client);
                } else {
                    restaurant.listeClientExpulse.add(client);
                }
            }
        }
        int randomResto = rand.nextInt(resto.size());
        System.out.println(resto.get(randomResto).getNom() + " j'ai servi "
                + resto.get(randomResto).listeClientServi.size() + " client " + " et j'en est expulsé " +
                resto.get(randomResto).listeClientExpulse.size());
    }
}

