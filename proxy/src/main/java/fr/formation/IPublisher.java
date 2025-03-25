package fr.formation;

public interface IPublisher {
    public void subscribe(ISubscriber sub);
    public void unsubscribe(ISubscriber sub);
    public void publish();
}
