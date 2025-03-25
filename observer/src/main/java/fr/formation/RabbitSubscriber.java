package fr.formation;

public class RabbitSubscriber implements ISubscriber {
    @Override
    public void update(IPublisher pub) {
        System.out.println("ENVOIE VERS RABBIT ...");
    }
}
