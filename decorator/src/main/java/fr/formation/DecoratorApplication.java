package fr.formation;

public class DecoratorApplication {
    public static void main(String[] args) {
        ProduitRepository produitRepository = RepositoryFactory.createProduitRepository();

        produitRepository.findAll();
    }
}