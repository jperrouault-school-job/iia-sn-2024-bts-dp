package fr.formation;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CacheProduitRepositoryProduit extends ProduitRepository {
    private final ProduitRepository repository;
    private List<Produit> cache = null;

    @Override
    public List<Produit> findAll() {
        if (this.cache == null) {
            this.cache = this.repository.findAll();
        }

        return this.cache;
    }
}
