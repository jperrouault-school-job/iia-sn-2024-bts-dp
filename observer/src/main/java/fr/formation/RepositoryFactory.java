package fr.formation;

public class RepositoryFactory {
    public static ProduitRepository createProduitRepository() {
        return new ProduitRepository();
    }
}
