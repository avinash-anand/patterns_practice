package patterns.behavioral.observer;

public class ObserverExample {

    public static void main(String[] args) {
        Publisher1 p1 = new Publisher1();
        Subscriber s1 = new Subscriber1();
        Subscriber s2 = new Subscriber2();
        p1.register(s1);
        p1.register(s2);
        p1.setInterestingValue(10);
        p1.setInterestingValue(20);
        p1.unRegister(s1);
        p1.setInterestingValue(30);
    }

}
