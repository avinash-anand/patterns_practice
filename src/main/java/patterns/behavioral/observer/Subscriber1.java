package patterns.behavioral.observer;

public class Subscriber1 implements Subscriber {
    @Override
    public void update(int x) {
        System.out.println("[Subscriber1] Updated interesting value = " + x);
    }
}
