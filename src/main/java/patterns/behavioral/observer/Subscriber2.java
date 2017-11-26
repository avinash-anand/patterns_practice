package patterns.behavioral.observer;

public class Subscriber2 implements Subscriber {
    @Override
    public void update(int x) {
        System.out.println("[Subscriber2] Updated interesting value = " + x);
    }
}
