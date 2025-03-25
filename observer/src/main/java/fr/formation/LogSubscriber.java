package fr.formation;

public class LogSubscriber implements ISubscriber {
    @Override
    public void update(IPublisher pub) {
        System.out.println("Journalisation ...");
    }
}
