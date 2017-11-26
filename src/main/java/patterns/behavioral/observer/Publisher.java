package patterns.behavioral.observer;

public interface Publisher {

    public void register(Subscriber subscriber);
    public void unRegister(Subscriber subscriber);
    public void notifySubscribers();

}
