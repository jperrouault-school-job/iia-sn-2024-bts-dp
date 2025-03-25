package fr.formation;

import java.util.List;

public class ProduitRepository {
    public List<Produit> findAll() {
        // List<Produit> produits = new ArrayList<>();

        // produits.add(Produit.builder().id("123").nom("Parachute de France").build());
        // produits.add(Produit.builder().id("879").nom("Casque de parachutiste").build());
        // produits.add(Produit.builder().id("791").nom("Altimètre").build());

        // return produits;

        return List.of(
            Produit.builder().id("123").nom("Parachute de France").build(),
            Produit.builder().id("879").nom("Casque de parachutiste").build(),
            Produit.builder().id("791").nom("Altimètre").build()
        );
    }
}
