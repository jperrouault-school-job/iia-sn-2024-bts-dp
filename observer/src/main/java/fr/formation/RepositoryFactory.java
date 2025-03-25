package fr.formation;

public class RepositoryFactory {
    public static ProduitRepository createProduitRepository() {
        ProduitRepository repo = new ProduitRepository();

        repo.subscribe(new KafkaSubscriber());
        repo.subscribe(new LogSubscriber());
        repo.subscribe(new RabbitSubscriber());

        return repo;
    }
}
