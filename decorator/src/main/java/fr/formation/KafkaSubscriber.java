package fr.formation;

public class KafkaSubscriber implements ISubscriber {
    @Override
    public void update(IPublisher pub) {
        System.out.println("ENVOIE VERS KAFKA ...");
    }
}
