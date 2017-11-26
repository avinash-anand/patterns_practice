package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher1 implements Publisher {

    private int interestingValue;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void setInterestingValue(int x) {
        this.interestingValue = x;
        this.notifySubscribers();
    }

    public int getInterestingValue() {
        return this.interestingValue;
    }

    @Override
    public void register(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unRegister(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(a -> a.update(this.interestingValue));
    }
}
