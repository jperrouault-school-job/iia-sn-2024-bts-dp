package fr.formation;

import java.util.List;

public class ProduitRepository {
    public List<Produit> findAll() {
        return List.of(
            Produit.builder().id("123").nom("Parachute de France").build(),
            Produit.builder().id("879").nom("Casque de parachutiste").build(),
            Produit.builder().id("791").nom("Altimètre").build()
        );
    }
}
