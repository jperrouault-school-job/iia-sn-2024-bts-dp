package fr.formation;

public class ObserverApplication {
    public static void main(String[] args) {
        ProduitRepository produitRepository = RepositoryFactory.createProduitRepository();

        produitRepository.findAll();
    }
}