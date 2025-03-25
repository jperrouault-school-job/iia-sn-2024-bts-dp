package fr.formation;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObserverProduitRepositoryDecorator extends ProduitRepository implements IPublisher {
    private final ProduitRepository repository;
    private List<ISubscriber> subscribers = new ArrayList<>();
    
    @Override
    public List<Produit> findAll() {
        this.publish(); // Ma décoration
        return this.repository.findAll();
    }

    @Override
    public void subscribe(ISubscriber sub) {
        this.subscribers.add(sub);
    }
    
    @Override
    public void unsubscribe(ISubscriber sub) {
        this.subscribers.remove(sub);
    }

    @Override
    public void publish() {
        for (ISubscriber sub : this.subscribers) {
            sub.update(this);
        }
    }

    // public ObserverProduitRepositoryDecorator(ProduitRepository repository) {
    //     this.repository = repository;
    // }
}
