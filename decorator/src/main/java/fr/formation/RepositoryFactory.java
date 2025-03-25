package fr.formation;

public class RepositoryFactory {
    public static ProduitRepository createProduitRepository() {
        ProduitRepository repo = new ProduitRepository();
        
        repo = new ObserverProduitRepositoryDecorator(repo);

        ((ObserverProduitRepositoryDecorator)repo).subscribe(new KafkaSubscriber());
        ((ObserverProduitRepositoryDecorator)repo).subscribe(new LogSubscriber());
        ((ObserverProduitRepositoryDecorator)repo).subscribe(new RabbitSubscriber());

        return repo;
    }
}
