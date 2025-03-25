package fr.formation;

public class ProxyApplication {
    public static void main(String[] args) {
        ProduitRepository produitRepository = RepositoryFactory.createProduitRepository();

        produitRepository.findAll();
        produitRepository.findAll();
        produitRepository.findAll();
        produitRepository.findAll();
    }
}