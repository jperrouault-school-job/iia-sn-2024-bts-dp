package fr.formation;

import java.util.ArrayList;
import java.util.List;

public class ProduitRepository implements IPublisher {
    private List<ISubscriber> subscribers = new ArrayList<>();

    public List<Produit> findAll() {
        // List<Produit> produits = new ArrayList<>();

        // produits.add(Produit.builder().id("123").nom("Parachute de France").build());
        // produits.add(Produit.builder().id("879").nom("Casque de parachutiste").build());
        // produits.add(Produit.builder().id("791").nom("Altimètre").build());

        // return produits;

        System.out.println("CHARGEMENT ...");

        this.publish();

        return List.of(
            Produit.builder().id("123").nom("Parachute de France").build(),
            Produit.builder().id("879").nom("Casque de parachutiste").build(),
            Produit.builder().id("791").nom("Altimètre").build()
        );
    }

    @Override
    public void subscribe(ISubscriber sub) {
        this.subscribers.add(sub);
    }
    
    @Override
    public void unsubscribe(ISubscriber sub) {
        this.subscribers.remove(sub);
    }

    @Override
    public void publish() {
        for (ISubscriber sub : this.subscribers) {
            sub.update(this);
        }
    }
}
