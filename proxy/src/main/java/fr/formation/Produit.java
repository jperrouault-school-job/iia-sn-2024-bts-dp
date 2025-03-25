package fr.formation;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class Produit {
    private String id;
    private String nom;
}
